package com.cognizant.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.model.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");

		Employee e = factory.getBean("emp1", Employee.class);
		System.out.println(e.getId() + "\t" + e.getName() + "\t" + e.getSalary());


		Employee e1 = factory.getBean("emp1", Employee.class);
		e1.setId(1001);
		e1.setName("purshottam kumar");
		e1.setSalary(23000);
		
		
		Employee e2 = factory.getBean("emp1", Employee.class);
		e2.setId(1002);
		e2.setName("ramanand kumar");
		e2.setSalary(53000);
		

		System.out.println(e1.getId() + "\t" + e1.getName() + "\t" + e1.getSalary());
		System.out.println(e2.getId() + "\t" + e2.getName() + "\t" + e2.getSalary());


	}
}
