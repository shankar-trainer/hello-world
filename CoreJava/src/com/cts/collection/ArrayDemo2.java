package com.cts.collection;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayDemo2 {

	public static void main(String[] args) {
	
		int id[]= {1003,1001, 1002};
		String name[]= {"manohar","suman","aman"};
		float salary[]= {12000,11000, 16000};
		
		Employee1 employee[]=new Employee1[3];
		for (int i = 0; i < employee.length; i++) {
			employee[i]=new Employee1();
			employee[i].setEmpId(id[i]);
			employee[i].setEmpName(name[i]);
			employee[i].setSalary(salary[i]);
		}
		
		Arrays.sort(employee);
		
		for (Employee1 employee1 : employee) {
			System.out.println(employee1.getEmpId()+" "+employee1.getEmpName()+"  "+employee1.getSalary());
		}
	}
}
