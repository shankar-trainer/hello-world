package com.capgemini.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.beans.Customer;

public class CustomerMain {

	public static void main(String[] args) {
		//BeanFactory beanfactory = new ClassPathXmlApplicationContext("beans.xml");
		ApplicationContext beanfactory = new ClassPathXmlApplicationContext("beans.xml");
		
		Customer bean = beanfactory.getBean(Customer.class);
		
		System.out.println(bean);
	}
}
