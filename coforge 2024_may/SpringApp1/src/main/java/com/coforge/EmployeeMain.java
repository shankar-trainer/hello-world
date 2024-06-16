package com.coforge;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.model.Employee;

public class EmployeeMain {

	public static void main(String[] args) {

		//BeanFactory beanFactory 
   //ApplicationContext beanFactory
    ConfigurableApplicationContext beanFactory  = new ClassPathXmlApplicationContext("beans.xml");

		Employee e = beanFactory.getBean("emp1", Employee.class);

		System.out.println(e);
		System.out.println("Employee data");
		System.out.println("\tEmployee id :"+e.getId());
		System.out.println("\tEmployee name :"+e.getName());
		System.out.println("\tEmployee salary :"+e.getSalary());
		
		
		Employee e1 = beanFactory.getBean("emp1", Employee.class);

		e1.setId(899898);
		e1.setName("pawan kumar");
		e1.setSalary(67000);
		
		
		System.out.println(e);
		System.out.println(e1);
		
		beanFactory.close();
	}
}
