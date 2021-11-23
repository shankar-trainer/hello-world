package com.capgemini.collection;

import java.util.Arrays;

public class EmployeeMain {
	public static void main(String[] args) {

		Employee emp[]=new Employee[4];
		int id[]= {675,789,1001,901};
		String name[]= {"upendra kumar","bipin kumar","ashok kumar","suresh kumar"};
		float salary[]= {45000,34000,80000,12000};
		
		for (int i = 0; i <emp.length; i++) {
			emp[i]=new Employee();
			emp[i].setId(id[i]);	
			emp[i].setName(name[i]);	
			emp[i].setSalary(salary[i]);
			
		}
		
		Arrays.sort(emp);
		
		System.out.println("sorted employee ");
		for (Employee e : emp) {
			System.out.println(e.getId()+"  "+e.getName()+"  "+e.getSalary());
		}
		
	}

}
