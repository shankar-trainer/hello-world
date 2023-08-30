package com.abc;

import com.coforge.Employee;

public class EmployeeMain extends Employee {

	public static void main(String[] args) {
		Employee employee = new Employee();

		employee.id = 98888998;
		employee.name = "hari kumar";
		System.out.println(employee.id);
		System.out.println(employee.name);
		System.out.println(new EmployeeMain().state);
		employee.welcome();
	}

}
