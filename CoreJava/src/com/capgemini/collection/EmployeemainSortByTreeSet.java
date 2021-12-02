package com.capgemini.collection;

import java.util.TreeSet;

public class EmployeemainSortByTreeSet {

	public static void main(String[] args) {
		
		Employee emp[]=new Employee[4];
		int id[]= {675,789,1001,901};
		String name[]= {"upendra kumar","bipin kumar","ashok kumar","suresh kumar"};
		float salary[]= {45000,34000,80000,12000};
		
		TreeSet<Employee> set1=new TreeSet<>();
		for (int i = 0; i <emp.length; i++) {
			emp[i]=new Employee();
			emp[i].setId(id[i]);	
			emp[i].setName(name[i]);	
			emp[i].setSalary(salary[i]);
		    set1.add(emp[i]);	
		}
		
		System.out.println("sorted employee ");
		for (Employee e : set1) {
			System.out.println(e.getId()+"  "+e.getName()+"  "+e.getSalary());
		}

		
		
		
	}
}
