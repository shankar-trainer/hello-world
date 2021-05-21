package com.cts.collection;

import java.util.Arrays;
import java.util.Comparator;

class Employee3 {
	private int empId;
	private String empName;
	private float empSalary;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}

}

class EmployeeSortById1 implements Comparator<Employee3> {

	@Override
	public int compare(Employee3 o1, Employee3 o2) {
		if (o1.getEmpId() > o2.getEmpId())
			return 1;
		else if (o1.getEmpId() < o2.getEmpId())
			return -1;
		else
			return 0;
	}
}
class EmployeeSortBySalary1 implements Comparator<Employee3> {
	
	@Override
	public int compare(Employee3 o1, Employee3 o2) {
		
		return new Float(o1.getEmpSalary()).compareTo(new Float(o2.getEmpSalary()));
		
	}
}
class EmployeeSortByName1 implements Comparator<Employee3> {
	
	@Override
	public int compare(Employee3 o1, Employee3 o2) {
	 return  o1.getEmpName().compareTo(o2.getEmpName());
	}
}

public class SortPrg2 {

	public static void main(String[] args) {
		int id[] = { 1009, 1001, 1002 };
		String name[] = { "pankaj kumar", "harendra kumar", "amrendra kumar" };
		float salary[] = { 20000, 12000, 15000 };

		Employee3 employee[] = new Employee3[3];
		for (int i = 0; i < employee.length; i++) {
			employee[i] = new Employee3();

			employee[i].setEmpId(id[i]);
			employee[i].setEmpName(name[i]);
			employee[i].setEmpSalary(salary[i]);

		}
 
		
		Arrays.sort(employee, new EmployeeSortById1());
		System.out.println("sorted By Id ");
		
		for (int i = 0; i < employee.length; i++) {
			System.out.println(
					employee[i].getEmpId() + "  " + employee[i].getEmpName() + "  " + employee[i].getEmpSalary());
		}
		
		Arrays.sort(employee, new EmployeeSortByName1());
		System.out.println("\nsorted By Name ");
		
		for (int i = 0; i < employee.length; i++) {
			System.out.println(
					employee[i].getEmpId() + "  " + employee[i].getEmpName() + "  " + employee[i].getEmpSalary());
		}

		Arrays.sort(employee, new EmployeeSortBySalary1());
		System.out.println("\nsorted By Salary ");
		
		for (int i = 0; i < employee.length; i++) {
			System.out.println(
					employee[i].getEmpId() + "  " + employee[i].getEmpName() + "  " + employee[i].getEmpSalary());
		}
		

	}
}
