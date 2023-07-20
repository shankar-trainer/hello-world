package com.coforge.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.coforge.model.Sales;

public class SalesMain {

	public static void main(String[] args) {

//		BeanFactory factory = new FileSystemXmlApplicationContext("src/main/resources/beans.xml");
		// ApplicationContext factory = new
		// FileSystemXmlApplicationContext("src/main/resources/beans.xml");
		ConfigurableApplicationContext factory = new FileSystemXmlApplicationContext("src/main/resources/beans.xml");

		Sales sales1 = factory.getBean("sales1", Sales.class);
		Sales sales2 = factory.getBean("sales1", Sales.class);

		sales2.setSalesId(656565);
		sales2.setSalesName("book sales");
		sales2.setSalesCost(45000);
		
		System.out.println(sales1);
		System.out.println(sales2);
		
		factory.close();

	}
}
