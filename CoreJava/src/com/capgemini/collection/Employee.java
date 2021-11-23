package com.capgemini.collection;

public class Employee implements Comparable<Employee> {

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

	@Override
	public int compareTo(Employee o) {
		if (this.id < o.id)
			return -1;

		else if (this.id > o.id)
			return 1;
		else
			return 0;

	}

}
