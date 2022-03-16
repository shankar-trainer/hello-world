package com.capgemini.collection;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeMain2 {

	public static void main(String[] args) {
		
		int id1[]= {1002,1001,1003};
		float salary1[]= {30000,15000,20000};
		String nm[]= {"suresh kumar","amit verma","priyashu kumar"};
		
		Employee employee[]=new Employee[3];
		
		ArrayList<Employee> empList=new ArrayList<>();
		
		for (int i = 0; i < employee.length; i++) {
			employee[i]=new Employee(id1[i],nm[i],salary1[i]);
			empList.add(employee[i]);
		}
		
		System.out.println("Unsorted Employees");
		for (Employee employee2 : empList) {
			System.out.println(employee2);
		}
		
		Collections.sort(empList);
		
		System.out.println("sorted employees by id \n");
		for (Employee employee2 : empList) {
			System.out.println(employee2);
		}
		
		
		
		
	}
}
