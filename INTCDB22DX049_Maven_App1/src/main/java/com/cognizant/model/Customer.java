package com.cognizant.model;

public class Customer {

	private int id;
	private String name;
	private float salary;
	
	public Customer(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public float getSalary() {
		return salary;
	}
	
	
	
}
