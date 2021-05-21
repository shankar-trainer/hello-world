package com.cts.collection;

import java.util.Arrays;

public class Employee2Test {

	
	
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
			
			Arrays.sort(employee);
			
			for (Employee2 employee1 : employee) {
				System.out.println(employee1.getEmpId()+" "+employee1.getEmpName()+"  "+employee1.getSalary());
			}
		
		}
	}

