import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.dao.ProductDao;
import com.cts.dao.ProductDaoImpl;
import com.cts.exception.ProductException;
import com.cts.model.Product;

public class ProductMain {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(ProductDaoImpl.class);
		
		ProductDaoImpl dao = context.getBean(ProductDaoImpl.class);
		
		Product product1=new Product();
		product1.setId(100001);
		product1.setName("java book");
		product1.setCost(2300);
		
		Product product2=new Product();
		product2.setId(100002);
		product2.setName("spring book");
		product2.setCost(3000);
		
		try {
		dao.addProduct(product1);
		
		System.out.println("product1 added");
		dao.addProduct(product2);
		System.out.println("product2 added");
		
		dao.addProduct(product1);
		System.out.println("product1 added");
		}
		catch (ProductException e) {
			System.err.println(e.getMessage());
		}	
		
		
		
		List<Product> allProduct = dao.getAllProduct();
		
		System.out.println("getall products ");
		
		allProduct.forEach(System.out::println);
		
		
	}
}
