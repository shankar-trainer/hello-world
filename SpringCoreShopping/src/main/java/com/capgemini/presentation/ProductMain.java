package com.capgemini.presentation;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.beans.Product;
import com.capgemini.error.ProductException;
import com.capgemini.service.ProductService;

public class ProductMain {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

		Product product1 = new Product();
		Product product2 = new Product();
		Product product3 = new Product();

		product1.setPrdId(100001);
		product1.setPrdName("television");
		product1.setPrdCost(50000.00f);

		product2.setPrdId(100002);
		product2.setPrdName("mobile");
		product2.setPrdCost(10000.00f);

		product3.setPrdId(100003);
		product3.setPrdName("trouser");
		product3.setPrdCost(800.00f);

		ProductService service = ctx.getBean(ProductService.class);
        try {
		List<Product> retrieveAllProuct = service.retrieveAllProuct();

		for (Product p : retrieveAllProuct) {
			System.out.println( p.getPrdId() + "\t" + p.getPrdName() + "\t" + p.getPrdCost());
		}
        }
        catch(ProductException e) {
        	System.err.println(e.getMessage()+"\n");
        }
		
		
		service.addItem(product1);
		
		service.addItem(product2);
		service.addItem(product3);

		List<Product> retrieveAllProuct = service.retrieveAllProuct();

		System.out.println("All Products Are \n");
		for (Product p : retrieveAllProuct) {
			System.out.println( p.getPrdId() + "\t" + p.getPrdName() + "\t" + p.getPrdCost());
		}
	}
}
