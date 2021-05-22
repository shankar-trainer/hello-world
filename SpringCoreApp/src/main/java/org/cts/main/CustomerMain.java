package org.cts.main;

import org.cts.beans.Customer;
import org.cts.beans.Employee;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerMain {

	public static void main(String[] args) {

		ApplicationContext beanFactory = new ClassPathXmlApplicationContext("beans.xml");

		Customer customer = beanFactory.getBean("customer1", Customer.class);

		System.out.println(customer);
		
	}
}
