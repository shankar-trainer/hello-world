package com.capgemini.collection;

public class Employee implements Comparable<Employee> 
{

	private int id;
	private String name;
	private float salary;
	
	public Employee(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee \n\tid=" + id + ", name=" + name + ", salary=" + salary;
	}

	@Override
	public int compareTo(Employee o) {
		if(this.id>o.id)
			return 1;
		
		else if(this.id<o.id)
			return -1;
		else 
		return 0;
	}
}
