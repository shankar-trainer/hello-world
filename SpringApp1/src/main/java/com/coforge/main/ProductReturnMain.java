package com.coforge.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.coforge.model.ProductReturn;
import com.coforge.model.Sales;

public class ProductReturnMain {

	public static void main(String[] args) {
		ApplicationContext factory = new FileSystemXmlApplicationContext("src/main/resources/application.xml");

		ProductReturn bean = factory.getBean("prdreturn",ProductReturn.class);
	
		
		System.out.println(bean);
		System.out.println("Product Return values ");
		System.out.println("\tId  :  "+bean.getPrductReturnId());
		System.out.println("\tLocation  :  "+bean.getPrductReturnLocation());
		System.out.println("\tReturn Date  :  "+bean.getPrductReturnDate());
	}
}
