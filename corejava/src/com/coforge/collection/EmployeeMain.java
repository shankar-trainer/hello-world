package com.coforge.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee employee[]=new Employee[3];
		employee[0]=new Employee(9009, "surendra mehta", 34000);
		employee[1]=new Employee(9002, "pawan kumar", 47000);
		employee[2]=new Employee(9005, "amit mehra", 14000);

		System.out.println("unsorted employee data ");
		System.out.println(Arrays.toString(employee));
	
		Arrays.sort(employee);
		
		System.out.println("sorted employee by id  data ");
		System.out.println(Arrays.toString(employee));
		
		List<Employee> asList = Arrays.asList(employee);
		
		System.out.println("collections sorting ..");
		Collections.sort(asList);
		System.out.println(asList);
		
	}
}
