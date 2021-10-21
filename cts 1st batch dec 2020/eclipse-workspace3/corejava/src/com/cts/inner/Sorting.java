package com.cts.inner;

import java.util.Arrays;
import java.util.Comparator;

class Employee {
	private int id;
	private String name;
	private float salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

}

public class Sorting {

	public static void main(String[] args) {
		int id1[] = { 1001, 1005, 1002, 1004 };
		String name1[] = { "ram kumar", "amit kumar", "bhuwanesh kumar", "deepak kumar" };
		float salary1[] = { 10000, 9000, 5000, 20000 };

		Employee employee[] = new Employee[4];

		for (int i = 0; i < employee.length; i++) {
			employee[i] = new Employee();
			employee[i].setId(id1[i]);
			employee[i].setName(name1[i]);
			employee[i].setSalary(salary1[i]);
		}
		
		Comparator<Employee> comparator1 =(emp1,emp2)->{
			 return emp1.getName().compareTo(emp2.getName());
		} ;
		
		Comparator<Employee> comparator2 =(emp1,emp2)->{
			return new Integer(emp1.getId()).compareTo(new Integer(emp2.getId()));
		} ;

		
		Arrays.sort(employee, comparator1);
		
		System.out.println("  sorting by name ");
		for (Employee employee2 : employee) {
			System.out.println(employee2.getId()+"  "+employee2.getName()+"  "+employee2.getSalary());
		}
		
		Arrays.sort(employee, comparator2);
		
		System.out.println("  sorting by Id ");
		for (Employee employee2 : employee) {
			System.out.println(employee2.getId()+"  "+employee2.getName()+"  "+employee2.getSalary());
		}
		
		
	}

}
