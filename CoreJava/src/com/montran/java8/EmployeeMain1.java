package com.montran.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeMain1 {

	public static void main(String[] args) {
		int id[] = { 111, 101, 119, 201, 100 };
		String name[] = { "suraj kumar", "amit balyan", "kumkum", "bhavna", "amita" };
		float salary[] = { 80000, 34000, 12000, 90000, 67000 };

		Employee employee[] = new Employee[4];
		for (int i = 0; i < employee.length; i++) {
			employee[i] = new Employee(id[i], name[i], salary[i]);
		}
		
		List<Employee> asList = Arrays.asList(employee);
	    
		Collections.sort(asList, (o1,o2)-> o1.getName().compareTo(o2.getName())  );
		System.out.println("sorting by name");
		
		for (Employee employee2 : asList) {
			System.out.println(employee2.getId()+"  "+employee2.getName()+"  "+employee2.getSalary());
		}
	
	}
}
