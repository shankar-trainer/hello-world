package org.com.pl;

import org.com.spel.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerMain {

	public static void main(String[] args) {

		ApplicationContext beanFactory = new ClassPathXmlApplicationContext("department.xml");

		Customer customer = beanFactory.getBean("cust", Customer.class);

		System.out.println(customer);

	}
}
