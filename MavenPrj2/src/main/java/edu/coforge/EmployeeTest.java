package edu.coforge;

import com.coforge.model.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee employee=new Employee(787887, "hari kumar", 45000);
		System.out.println("\tid "+employee.getId());
		System.out.println("\tname "+employee.getName());
		System.out.println("\tsalary "+employee.getSalary());
		
	}
}
