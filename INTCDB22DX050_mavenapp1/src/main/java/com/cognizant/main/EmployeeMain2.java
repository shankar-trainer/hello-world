package com.cognizant.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.model.Employee;

public class EmployeeMain2 {

	public static void main(String[] args) {
		BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");

		Employee e = factory.getBean("emp2", Employee.class);
		System.out.println(e.getId() + "\t" + e.getName() + "\t" + e.getSalary());


	}
}
