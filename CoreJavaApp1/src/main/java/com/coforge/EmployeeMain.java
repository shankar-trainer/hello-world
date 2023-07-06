package com.coforge;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.id = 98989;
		employee.name = "irfaan khan";
		System.out.println("country  is " + employee.country);
		employee.show();
	}
}
