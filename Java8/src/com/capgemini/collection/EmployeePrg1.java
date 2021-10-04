package com.capgemini.collection;

import java.util.Arrays;

public class EmployeePrg1 {

	public static void main(String[] args) {
		
		Employee employee[]=new Employee[3];
		int id1[]= {1003,1001,1002};
		String nm[]= {"ashok kumar","varun paratap","akhilesh kumar"};
		float salary1[]= {10000,9000,40000};
		
		for (int i = 0; i < salary1.length; i++) {
			employee[i]=new Employee();
			employee[i].setId(id1[i]);
			employee[i].setName(nm[i]);;
			employee[i].setSalary(salary1[i]);
		}
		
		Arrays.sort(employee);
		
		System.out.println("After sorting  by id  ");
		for (Employee e : employee) {
			System.out.println(e.getId()+"  "+e.getName()+"  "+e.getSalary());
		}
		
	}
}
