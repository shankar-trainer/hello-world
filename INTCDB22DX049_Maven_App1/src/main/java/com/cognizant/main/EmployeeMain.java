package com.cognizant.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.model.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		
		BeanFactory factory=new ClassPathXmlApplicationContext("beans.xml");
	Employee emp= factory.getBean("emp1",Employee.class);
	
	System.out.println("Employee1 \n");
	System.out.println(emp.getId());
	System.out.println(emp.getName());
	System.out.println(emp.getSalary());
	
	Employee emp1= factory.getBean("emp1",Employee.class);
	
	emp1.setId(10002);
	emp1.setName("anand murthy");
	emp1.setSalary(45000);
	
	Employee emp2= factory.getBean("emp1",Employee.class);
	
	emp2.setId(10003);
	emp2.setName("satya murthy");
	emp2.setSalary(85000);

	System.out.println("Employee2 \n");
	System.out.println(emp1.getId());
	System.out.println(emp1.getName());
	System.out.println(emp1.getSalary());

	System.out.println("Employee3 \n");
	System.out.println(emp2.getId());
	System.out.println(emp2.getName());
	System.out.println(emp2.getSalary());
	}
}
