
package com.example.main;

import com.example.model.Employee;

public class EmployeeMain2  extends Employee {
	
	public static void main(String[] args) {
		EmployeeMain2 employee = new EmployeeMain2();
		employee.empId = 989898;
		employee.empName = "mahadev";
		employee.empSalary = 900000;
	     employee.location="hyderabad";
		employee.empInformation();
	}
}
