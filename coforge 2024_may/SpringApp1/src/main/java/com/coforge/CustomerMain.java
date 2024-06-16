package com.coforge;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.model.Customer;

public class CustomerMain {

	public static void main(String[] args) {

		BeanFactory beanFactory = new ClassPathXmlApplicationContext("beans.xml");

		Customer customer = beanFactory.getBean("customer1", Customer.class);

		System.out.println(customer);
		System.out.println("Customer data");
		System.out.println("\tCustomer id :"+customer.getCustomerId());
		System.out.println("\tCustomer name :"+customer.getCustomerName());
		System.out.println("\tCustomer salary :"+customer.getCustomerSalary());
		
	}
}
