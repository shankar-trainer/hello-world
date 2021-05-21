package com.cts.inner;

import java.util.Arrays;


public class EmployeeMain {

	public static void main(String[] args) {
		int id[] = { 1009, 1001, 1002 };
		String name[] = { "pankaj kumar", "harendra kumar", "amrendra kumar" };
		float salary[] = { 20000, 12000, 15000 };

		Employee employee[] = new Employee[3];
		for (int i = 0; i < employee.length; i++) {
			employee[i] = new Employee();
			employee[i].setEmpId(id[i]);
			employee[i].setEmpName(name[i]);
			employee[i].setEmpSalary(salary[i]);

		}

		Arrays.sort(employee, (Employee o1, Employee o2) -> {
			if (o1.getEmpId() > o2.getEmpId())
				return 1;
			else if (o1.getEmpId() < o2.getEmpId())
				return -1;
			else
				return 0;
		});
		
		System.out.println("Sort By Id ");
		for (int i = 0; i < employee.length; i++) {
			System.out.println(
					employee[i].getEmpId() + "  " + employee[i].getEmpName() + "  " + employee[i].getEmpSalary());
		}
		
		Arrays.sort(employee, (Employee o1, Employee o2) -> 
				o1.getEmpName().compareTo(o2.getEmpName())
		);
		
		System.out.println("\nSort By  Name ");
		for (int i = 0; i < employee.length; i++) {
			System.out.println(
					employee[i].getEmpId() + "  " + employee[i].getEmpName() + "  " + employee[i].getEmpSalary());
		}
		
		
		
	}
}
