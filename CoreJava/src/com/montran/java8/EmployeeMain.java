package com.montran.java8;

import java.util.Arrays;
import java.util.Comparator;

public class EmployeeMain {

	public static void main(String[] args) {
		int id[] = { 111, 101, 119, 201, 100 };
		String name[] = { "suraj kumar", "amit balyan", "kumkum", "bhavna", "amita" };
		float salary[] = { 80000, 34000, 12000, 90000, 67000 };

		Employee employee[] = new Employee[4];
		for (int i = 0; i < employee.length; i++) {
			employee[i] = new Employee(id[i], name[i], salary[i]);
		}
		/*
		 * Comparator<Employee> comparator=new Comparator<Employee>() {
		 * 
		 * @Override public int compare(Employee o1, Employee o2) { return new
		 * Integer(o1.getId()).compareTo(new Integer(o2.getId())); } };
		 */

		Comparator<Employee> comparator1 = (x, y) -> new Integer(x.getId()).compareTo(new Integer(y.getId()));

		// Arrays.sort(employee,comparator1 );

		Arrays.sort(employee, (x, y) -> new Integer(x.getId()).compareTo(new Integer(y.getId())));

		System.out.println("sorted by id ");
		for (Employee employee2 : employee) {
			System.out.println(employee2.getId() + "  " + employee2.getName() + " " + employee2.getSalary());
		}

		Arrays.sort(employee, (x, y) -> x.getName().compareTo(y.getName()));

		System.out.println("\nsorted by  name \n");
		for (Employee employee2 : employee) {
			System.out.println(employee2.getId() + "  " + employee2.getName() + " " + employee2.getSalary());
		}

		Arrays.sort(employee, (x, y) -> new Float(x.getSalary()).compareTo(new Float(y.getSalary())));

		System.out.println("\n sorted by salary\n");
		for (Employee employee2 : employee) {
			System.out.println(employee2.getId() + "  " + employee2.getName() + " " + employee2.getSalary());
		}

	}
}
