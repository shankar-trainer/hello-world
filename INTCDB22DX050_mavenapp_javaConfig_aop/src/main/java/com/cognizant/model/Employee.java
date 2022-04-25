package com.cognizant.model;

import javax.annotation.PostConstruct;

public class Employee {

	private int id;
	private String name;
	private float salary;
	
	@PostConstruct
	public void init() {
		this.id=10003333;
		this.name="anil chamoli";
		this.salary=90000;
	}
	
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
