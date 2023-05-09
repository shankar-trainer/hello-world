package com.nec;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nec.dao.FeedbackRepository;
import com.nec.dao.OrderRepository;
import com.nec.dao.ProductRepository;
import com.nec.model.Order;
import com.nec.model.Product;
import com.nec.model.ProductFeedback;

@SpringBootApplication
public class ProductOrderMain implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(ProductOrderMain.class, args);

	}

	@Autowired
	FeedbackRepository feedbackDao;

	@Autowired
	ProductRepository prdDao;

	@Autowired
	OrderRepository orderDao;

	@Override
	public void run(String... args) throws Exception {

		Set<ProductFeedback> feedBackset1 = new HashSet<>();
		Set<ProductFeedback> feedBackset2 = new HashSet<>();

		feedBackset1
				.add(new ProductFeedback(76661, "excellent product", "amit kumar", LocalDate.now(), LocalTime.now()));
		feedBackset1.add(new ProductFeedback(76662, "good product", "sumit kumar", LocalDate.now(), LocalTime.now()));
		feedBackset1
				.add(new ProductFeedback(76663, "terrafic product", "balram kumar", LocalDate.now(), LocalTime.now()));
		feedBackset1
				.add(new ProductFeedback(76664, "average product", "jyoti kumar", LocalDate.now(), LocalTime.now()));

		feedBackset2
				.add(new ProductFeedback(86661, "terrafic product", "ajay kumar", LocalDate.now(), LocalTime.now()));
		feedBackset2.add(new ProductFeedback(86662, "average product", "arun kumar", LocalDate.now(), LocalTime.now()));
		feedBackset2
				.add(new ProductFeedback(86663, "excellent product", "laxman kumar", LocalDate.now(), LocalTime.now()));
		feedBackset2.add(new ProductFeedback(86664, "good product", "meera kumar", LocalDate.now(), LocalTime.now()));

		Order order1 = new Order(1, "book order", "warli");
		Order order2 = new Order(2, "tv order", "kalyan");

		Product product1 = new Product(1001, "spring boot beginner", 1600, order1, feedBackset1);
		Product product2 = new Product(1002, "TV", 86000, order2, feedBackset2);

		System.out.println("save product1 ");

		orderDao.save(order1);
		for (ProductFeedback productFeedback : feedBackset1) {
			feedbackDao.save(productFeedback);
		}
		
		System.out.println("==========================");
		
		System.out.println("save product2 ");

		for (ProductFeedback productFeedback : feedBackset2) {
			feedbackDao.save(productFeedback);
		}

		prdDao.save(product1);

		orderDao.save(order2);
		prdDao.save(product2);
		/*
		 * 
		 * System.out.println("all product1 ");
		 * 
		 * List<Product> findAll = prdDao.findAll(); Order order;
		 * 
		 * for (Product product : findAll) { System.out.println("Product");
		 * System.out.println(product); System.out.println("Order");
		 * System.out.println(product.getOrder()); }
		 */
	}
}


/*
http://localhost:9090/getAllPrd
localhost:9090/addProduct

    {
        "prdId": 1001,
        "prdName": "spring boot beginner",
        "prdCost": 1600.0,
        "order": {
            "orderId": 1,
            "orderName": "book order",
            "orderLocation": "warli"
        },
        "productFeedBackSet": [
            {
                "feedBackId": 76662,
                "feedback": "good product",
                "feedbackUserName": "sumit kumar",
                "feedBackDate": "2022-09-15",
                "feedBacTime": "15:23:22"
            },
            {
                "feedBackId": 76663,
                "feedback": "terrafic product",
                "feedbackUserName": "balram kumar",
                "feedBackDate": "2022-09-15",
                "feedBacTime": "15:23:22"
            },
            {
                "feedBackId": 76664,
                "feedback": "average product",
                "feedbackUserName": "jyoti kumar",
                "feedBackDate": "2022-09-15",
                "feedBacTime": "15:23:22"
            },
            {
                "feedBackId": 76661,
                "feedback": "excellent product",
                "feedbackUserName": "amit kumar",
                "feedBackDate": "2022-09-15",
                "feedBacTime": "15:23:22"
            }
        ]
    },
    {
        "prdId": 1002,
        "prdName": "TV",
        "prdCost": 86000.0,
        "order": {
            "orderId": 2,
            "orderName": "tv order",
            "orderLocation": "kalyan"
        },
        "productFeedBackSet": [
            {
                "feedBackId": 86663,
                "feedback": "excellent product",
                "feedbackUserName": "laxman kumar",
                "feedBackDate": "2022-09-15",
                "feedBacTime": "15:23:22"
            },
            {
                "feedBackId": 86661,
                "feedback": "terrafic product",
                "feedbackUserName": "ajay kumar",
                "feedBackDate": "2022-09-15",
                "feedBacTime": "15:23:22"
            },
            {
                "feedBackId": 86662,
                "feedback": "average product",
                "feedbackUserName": "arun kumar",
                "feedBackDate": "2022-09-15",
                "feedBacTime": "15:23:22"
            },
            {
                "feedBackId": 86664,
                "feedback": "good product",
                "feedbackUserName": "meera kumar",
                "feedBackDate": "2022-09-15",
                "feedBacTime": "15:23:22"
            }
        ]
    }



adding record 

*/
