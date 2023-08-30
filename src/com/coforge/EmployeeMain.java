package com.coforge;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee employee=new Employee();
		System.out.println(employee.id);
		System.out.println(employee.name);
		System.out.println(employee.state);
		
		employee.welcome();
	}
}
