package org.com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerMain {

	public static void main(String[] args) {

		BeanFactory beanFactory = new ClassPathXmlApplicationContext("beans.xml");

		Customer cst = (Customer) beanFactory.getBean("cust1");

		System.out.println(cst);
		
		System.out.println(cst.toString());
		

	}
}
