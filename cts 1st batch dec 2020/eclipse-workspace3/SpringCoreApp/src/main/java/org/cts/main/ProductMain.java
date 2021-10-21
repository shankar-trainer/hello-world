package org.cts.main;

import org.cts.beans.CollectionDemo;
import org.cts.beans.Employee;
import org.cts.beans.Product;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ProductMain {

	public static void main(String[] args) {
		
		ApplicationContext beanFactory = new ClassPathXmlApplicationContext("beans1.xml");
		Product prd1 = beanFactory.getBean("prd1", Product.class);
		System.out.println(prd1);
		
		System.out.println(beanFactory.getBean("prd1", Product.class));

	}
}
