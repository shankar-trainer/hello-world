package com.cts.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class EmployeeSortById implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return new Integer(o1.getId()).compareTo(new Integer(o2.getId()));
	}
}

class EmployeeSortByName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());
	}
}

class EmpMain1 {

	public static void main(String[] args) {
		ArrayList<Employee> list1 = new ArrayList<Employee>();
		int id1[] = { 1001, 1005, 1002, 1004 };
		String name1[] = { "ram kumar", "amit kumar", "bhuwanesh kumar", "deepak kumar" };
		float salary1[] = { 10000, 9000, 5000, 20000 };

		Employee employee[] = new Employee[4];

		for (int i = 0; i < employee.length; i++) {
			employee[i] = new Employee();
			employee[i].setId(id1[i]);
			employee[i].setName(name1[i]);
			employee[i].setSalary(salary1[i]);
			list1.add(employee[i]);
		}

//		list1.sort(new EmployeeSortById());

//		Collections.sort(list1, new EmployeeSortById());
		Collections.sort(list1, new EmployeeSortByName());

		System.out.println("sorting using list ");

		for (Employee employee2 : list1) {
			System.out.println(employee2.getId() + "  " + employee2.getName() + "  " + employee2.getSalary());
		}

		int binarySearch = Collections.binarySearch(list1, employee[2], new EmployeeSortByName());
	if(binarySearch>=0)
		System.out.println("found "+binarySearch);
		
	}
}

public class EmployeeMain {

	public static void main(String[] args) {
		int id1[] = { 1001, 1005, 1002, 1004 };
		String name1[] = { "ram kumar", "amit kumar", "bhuwanesh kumar", "deepak kumar" };
		float salary1[] = { 10000, 9000, 5000, 20000 };

		Employee employee[] = new Employee[4];

		for (int i = 0; i < employee.length; i++) {
			employee[i] = new Employee();
			employee[i].setId(id1[i]);
			employee[i].setName(name1[i]);
			employee[i].setSalary(salary1[i]);
		}

		// Arrays.sort(employee, new EmployeeSortById());
		Arrays.sort(employee, new EmployeeSortByName());

		for (Employee employee2 : employee) {
			System.out.println(employee2.getId() + "  " + employee2.getName() + "  " + employee2.getSalary());
		}
	}
}
