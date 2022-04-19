package edu.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.example.model.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("beans.xml");

		Employee e = (Employee) beanFactory.getBean("emp1");

		System.out.println("Id is "+e.getId());
		System.out.println("name  is "+e.getName());
		System.out.println("salary is "+e.getSalary());
		System.out.println("pf is "+e.getPf());
		System.out.println("gross salary  "+e.grossSalary());

		
		

	}
	
}
