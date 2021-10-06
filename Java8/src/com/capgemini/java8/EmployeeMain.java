package com.capgemini.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class EmployeeMain {

	public static void main(String[] args) {
		int id1[] = { 1003, 1001, 1002 };
		String nm[] = { "ashok kumar", "varun paratap", "akhilesh kumar" };
		float salary1[] = { 10000, 9000, 40000 };

		Employee emp[] = new Employee[3];
		for (int i = 0; i < emp.length; i++) {
			emp[i] = new Employee();
			emp[i].setId(id1[i]);
			emp[i].setName(nm[i]);
			emp[i].setSalary(salary1[i]);
		}

		for (Employee employee : emp)
			System.out.println(employee);

		System.out.println("\nsorted by id ");

		Comparator<Employee> comparator = new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return Integer.valueOf(o1.getId()).compareTo(Integer.valueOf(o2.getId()));
			}
		};
		
		Arrays.sort(emp,comparator);
		
		for (Employee employee : emp)
			System.out.println(employee);

		System.out.println("\nsorted by name ");
		
		Comparator<Employee> comparator1 = (k,l)-> {
				return k.getName().compareTo(l.getName());
		};
		
		Arrays.sort(emp,comparator1);
		
		for (Employee employee : emp)
			System.out.println(employee);
		

	}
}
