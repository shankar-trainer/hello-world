package org.com.capgemini.pl;

import org.com.capgemini.config.ApplicationConfig;
import org.com.capgemini.dao.ProductDao;
import org.com.capgemini.dao.ProductDaoImpl;
import org.com.capgemini.model.Product;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProductMain {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);

		ProductDao dao = ctx.getBean("productDaoImpl", ProductDao.class);

		Product product1 = new Product();
		product1.setPrd_name("spring in action");
		product1.setPrd_cost(1200);

		Product product2 = new Product();
		product2.setPrd_name("spring for beginner");
		product2.setPrd_cost(700);

		Product product3 = new Product();
		product3.setPrd_name("spring recipee");
		product3.setPrd_cost(2100);

		dao.storeProduct(product1);
		dao.storeProduct(product2);
		dao.storeProduct(product3);

		dao.getAllProduct().stream().forEach(System.out::println);
		ctx.close();
	}
}
