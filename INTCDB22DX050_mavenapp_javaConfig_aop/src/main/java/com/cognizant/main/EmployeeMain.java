package com.cognizant.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cognizant.config.AppConfig;
import com.cognizant.model.Employee;

public class EmployeeMain {
static void display(Employee emp) {
	System.out.println("\n Employee data   ");
	System.out.println("\tid is " + emp.getId());
	System.out.println("\tname is " + emp.getName());
	System.out.println("\tsalary is " + emp.getSalary());
}
	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		Employee emp = ctx.getBean(Employee.class);
		
		System.out.println("Employee 1 ");
		display(emp);
		
		Employee emp1 = ctx.getBean(Employee.class);
		Employee emp2 = ctx.getBean(Employee.class);
		
		
		emp1.setId(9001);
		emp1.setName("madan kumar");
		emp1.setSalary(34000);
		
		emp2.setId(9002);
		emp2.setName("virendra kumar");
		emp2.setSalary(39000);
	
		System.out.println("Employee 2 ");
		display(emp1);
		
		System.out.println("Employee 3 ");
		display(emp2);
		
	}
}
