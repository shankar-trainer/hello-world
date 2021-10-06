package org.com.capgemini.pl;

import org.com.capgemini.model.Product;
import org.com.capgemini.service.ProductService;
import org.com.capgemini.config.ApplicationConfig;
import org.com.capgemini.dao.ProductDao;
import org.com.capgemini.dao.ProductDaoImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProductMain_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		ProductService  service = 
				ctx.getBean("productService",ProductService.class);
		
		ProductService  service2 = 
				ctx.getBean(ProductService.class);
		
		
		Product product1 = new Product();
		
		product1.setPrd_name("Spring in action");
		
		product1.setPrd_cost(1233);
		

		Product product2 = new Product();
		
		product2.setPrd_name("Spring for Beginner");
		
		product2.setPrd_cost(890);
		
		service.addProduct(product1);
		service.addProduct(product2);
		
		
		service.showAllProduct();
		
		service.deleteProduct(product2);

		service.showAllProduct();
		
		ctx.close();
	}

}
