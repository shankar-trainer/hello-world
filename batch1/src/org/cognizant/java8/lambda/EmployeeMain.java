package org.cognizant.java8.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class EmployeeMain {

	static class SortByEmpId implements Comparator<Employee> {

		@Override
		public int compare(Employee o1, Employee o2) {
			return new Integer(o1.getEmpId()).compareTo(new Integer(o2.getEmpId()));
		}
	}

	static class SortByEmpName implements Comparator<Employee> {
		
		@Override
		public int compare(Employee o1, Employee o2) {
			return (o1.getEmpName()).compareTo(o2.getEmpName());
		}
	}
	
	static class SortByEmpSalary implements Comparator<Employee> {
		
		@Override
		public int compare(Employee o1, Employee o2) {
			return new Float(o1.getEmpSalary()).compareTo(new Float(o2.getEmpSalary()));
		}
	}
	
	public static void main(String[] args) {

		Employee emp[] = new Employee[3];

		emp[0] = new Employee(10003, "mahadev kumar", 12000);
		emp[1] = new Employee(10001, "rahul kumar", 10000);
		emp[2] = new Employee(10002, "aditya kumar", 18000);

		Arrays.sort(emp, new SortByEmpId());
		System.out.println("sorted by id \n");
		for (Employee employee : emp) {
			System.out.println(employee.getEmpId() + " " + employee.getEmpName() + "  " + employee.getEmpSalary());
		}
		
		Arrays.sort(emp, new SortByEmpName());
		System.out.println("sorted by name \n");
		for (Employee employee : emp) {
			System.out.println(employee.getEmpId() + " " + employee.getEmpName() + "  " + employee.getEmpSalary());
		}
		
		Arrays.sort(emp, new SortByEmpSalary());
		System.out.println("sorted by salary \n");
		for (Employee employee : emp) {
			System.out.println(employee.getEmpId() + " " + employee.getEmpName() + "  " + employee.getEmpSalary());
		}
		

	}
}
