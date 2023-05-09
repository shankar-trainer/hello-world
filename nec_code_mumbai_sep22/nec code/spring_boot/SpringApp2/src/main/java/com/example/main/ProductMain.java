package com.example.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.config.JavaConfiguration;
import com.example.model.Product;

public class ProductMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfiguration.class);

		Product prd1 = ctx.getBean(Product.class);
		Product prd2 = ctx.getBean(Product.class);
		
		prd2.setPrdId(9999);
		prd2.setPrdCost(677);
		prd2.setPrdName("shirt");
		
		System.out.println("Product1");
		System.out.println(prd1);

		System.out.println("-------------");
		System.out.println("Product2");
		System.out.println(prd2);
		
		System.out.println("Product Order details ");
		System.out.println(prd1.getOrder());
	}
}
