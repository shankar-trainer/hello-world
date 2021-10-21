package org.com.capgemini.pl;

import org.com.capgemini.model.Product;
import org.com.capgemini.config.ApplicationConfig;
import org.com.capgemini.dao.ProductDao;
import org.com.capgemini.dao.ProductDaoImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		ProductDao  dao = 
				ctx.getBean("productDaoImpl",ProductDao.class);
		
		Product product1 = new Product();
		
		product1.setPrd_name("Spring in action");
		
		product1.setPrd_cost(1233);
		

		Product product2 = new Product();
		
		product2.setPrd_name("Spring for Beginner");
		
		product2.setPrd_cost(890);
		
		dao.storeProduct(product1);
		dao.storeProduct(product2);
		
		dao.getAllProduct().stream().forEach(System.out::println);
		
		ctx.close();
		
	}

}
