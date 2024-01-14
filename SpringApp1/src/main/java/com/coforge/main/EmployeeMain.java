package com.coforge.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.model.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		 
	  ApplicationContext beanFactory	= new       
	    		    ClassPathXmlApplicationContext("beans.xml");

		Employee emp1= beanFactory.getBean("emp1",Employee.class);
		Employee emp2= beanFactory.getBean("emp1",Employee.class);
		
		emp2.setEmpId(676767);
		emp2.setEmpName("kamal partap");
		emp2.setEmpSalary(45000);
		
		System.out.println("\nemployee1 data ");
		System.out.println("\temployee id  "+emp1.getEmpId());
		System.out.println("\temployee name  "+emp1.getEmpName());
		System.out.println("\temployee salary  "+emp1.getEmpSalary());
		System.out.println("\n\tAddress "+emp1.getAddress());
	
		System.out.println("\nemployee2 data ");
		System.out.println("\temployee id  "+emp2.getEmpId());
		System.out.println("\temployee name  "+emp2.getEmpName());
		System.out.println("\temployee salary  "+emp2.getEmpSalary());
		System.out.println("\n\tAddress "+emp2.getAddress());
	}
}
