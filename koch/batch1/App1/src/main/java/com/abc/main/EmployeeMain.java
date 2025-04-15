package com.abc.main;

import com.abc.model.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee employee=new Employee();
		employee.setId(100001);
		employee.setName("suresh kumar");
		employee.setSalary(200000);
		
		System.out.println("Employee Information");
		System.out.println("\tId is :"+employee.getId());
		System.out.println("\tName is :"+employee.getName());
		System.out.println("\tSalary is :"+employee.getSalary());
	}
}
