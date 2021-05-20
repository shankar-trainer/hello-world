package com.cts;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.model.Customer;
import com.cts.model.Employee;

public class CustomerMain {

	public static void main(String[] args) {
		
		BeanFactory beanFactory=new ClassPathXmlApplicationContext("application.xml");
		
		Customer cust=  (Customer)beanFactory.getBean("cst");
	
		
		System.out.println(cust.getCustomerId());
		System.out.println(cust.getCustomerName());
		System.out.println(cust.getCustomerSalary());
		
	}
}
