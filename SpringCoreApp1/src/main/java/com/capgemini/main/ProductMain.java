package com.capgemini.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.beans.Product;

public class ProductMain {
	public static void main(String[] args) {
		//ApplicationContext 
	ConfigurableApplicationContext	beanfactory = new ClassPathXmlApplicationContext("application.xml");
		Product prd1 = beanfactory.getBean(Product.class);
		Product prd2 = beanfactory.getBean(Product.class);

		prd1.setPrdId(1001);
		prd1.setPrdName("shirt");
		prd1.setPrdCost(1200);
		
		prd2.setPrdId(1002);
		prd2.setPrdName("pant");
		prd2.setPrdCost(1800);
		
		
		System.out.println(prd1);
		System.out.println(prd2);
		
		beanfactory.close();
	}
}
