package org.com.capgemini.pl;

import org.com.capgemini.config.ApplicationConfig;
import org.com.capgemini.dao.ProductDao;
import org.com.capgemini.dao.ProductDaoImpl;
import org.com.capgemini.model.Product;
import org.com.capgemini.service.ProductService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProductMain2 {

	 
	
		public static void main(String[] args) {
	
			AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext
					(ApplicationConfig.class);
	
		//	ProductService service = ctx.getBean("productService",ProductService.class);
			ProductService service = ctx.getBean("ps",ProductService.class);
			//ProductService service = ctx.getBean(ProductService.class);
			
			Product product1 = new Product();
			product1.setPrd_name("spring in action");
			product1.setPrd_cost(1200);
	
			Product product2 = new Product();
			product2.setPrd_name("spring for beginner");
			product2.setPrd_cost(700);
	
			Product product3 = new Product();
			product3.setPrd_name("spring recipee");
			product3.setPrd_cost(2100);
	
			service.addProduct(product1);
			service.addProduct(product2);
			service.addProduct(product3);
	
			service.addProduct(product1);
			
			service.deleteProduct(product1);
			
			service.showAllProduct();
			ctx.close();
		}
	}


