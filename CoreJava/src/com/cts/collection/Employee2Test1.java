package com.cts.collection;

import java.util.Arrays;
import java.util.Comparator;


class EmployeeSortbyId implements Comparator<Employee2>{
	@Override
	public int compare(Employee2 o1, Employee2 o2) {
		return new Integer(o2.getEmpId()).compareTo(new Integer(o1.getEmpId()));
	}
}

public class Employee2Test1 {

	public static void main(String[] args) {

		int id[]= {1003,1001, 1002};
		String name[]= {"manohar","suman","aman"};
		float salary[]= {12000,11000, 16000};
		
		Employee2 employee[]=new Employee2[3];
		for (int i = 0; i < employee.length; i++) {
			employee[i]=new Employee2();
			employee[i].setEmpId(id[i]);
			employee[i].setEmpName(name[i]);
			employee[i].setSalary(salary[i]);
		}
		
		Arrays.sort(employee, new EmployeeSortbyId());
		System.out.println("sorted by id ");
		for (Employee2 employee1 : employee) {
			System.out.println(employee1.getEmpId()+" "+employee1.getEmpName()+"  "+employee1.getSalary());
		}
		
		System.out.println("\nsort by salary using lambda \n");

		
		Comparator<Employee2> comparator=(Employee2 o1, Employee2 o2)->{
		   return new Float(o1.getSalary()).compareTo(new Float(o2.getSalary()));	
		};
		
		Arrays.sort(employee, comparator);
		
		for (Employee2 employee1 : employee) {
			System.out.println("\t"+employee1.getEmpId()+" "+employee1.getEmpName()+"  "+employee1.getSalary());
		}
		
	}
}
