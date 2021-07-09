package edu.cognizant;

import com.cognizant.Employee;

public class EmployeeMainProgram   extends Employee{

	public static void main(String[] args) {
		Employee employee = new Employee(445455, "hari mohan jha", 60000);
		System.out.println(employee.empId);
		System.out.println(employee.empName);
		System.out.println(employee.salary);
		System.out.println(new EmployeeMainProgram().location);

	}
}
