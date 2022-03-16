package com.capgemini.collection;

import java.util.Arrays;

public class EmployeeMain {

	public static void main(String[] args) {
		int id1[]= {1002,1001,1003};
		float salary1[]= {30000,15000,20000};
		String nm[]= {"suresh kumar","amit verma","priyashu kumar"};
		
		
		Employee employee[]=new Employee[3];
		
		for (int i = 0; i < employee.length; i++) {
			employee[i]=new Employee(id1[i],nm[i],salary1[i]);
		}
		
		System.out.println("unsorted ");
		for (Employee employee2 : employee) {
			System.out.println(employee2);
		}
		
		Arrays.sort(employee);
		
		System.out.println("sorted ");
		for (Employee employee2 : employee) {
			System.out.println(employee2);
		}
	}
}
