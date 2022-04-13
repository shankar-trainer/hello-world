package com.cognizant.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.model.Customer;

public class CustomerMain {

	public static void main(String[] args) {

		BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
		Customer c = factory.getBean(Customer.class);
		System.out.println("id is " + c.getId());
		System.out.println("name is " + c.getName());
		System.out.println("salary is " + c.getSalary());
	}
}
