import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.dao.ProductDao;
import com.cts.dao.ProductDaoImpl;
import com.cts.exception.ProductException;
import com.cts.model.Product;
import com.cts.service.ProductService;

public class ProductMain2 {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ProductService.class);
		ProductService service = context.getBean(ProductService.class);

		Product product1 = new Product();
		product1.setId(100001);
		product1.setName("java book");
		product1.setCost(2300);

		Product product2 = new Product();
		product2.setId(100002);
		product2.setName("spring book");
		product2.setCost(3000);

		try {
			System.out.println("getall products ");
			List<Product> allProduct = service.getAllProduct();

			allProduct.forEach(System.out::println);
		} catch (ProductException e) {
			System.err.println(e.getMessage());
		}

		try {
			service.addProduct(product1);

			System.out.println("product1 added");
			service.addProduct(product2);
			System.out.println("product2 added");

			service.addProduct(product1);
			System.out.println("product1 added");
		} catch (ProductException e) {
			System.err.println(e.getMessage());
		}
		try {
			List<Product> allProduct1 = service.getAllProduct();
			System.out.println("getall products ");
			allProduct1.forEach(System.out::println);
		} catch (ProductException e) {
			System.err.println(e.getMessage());
		}

	}
}
