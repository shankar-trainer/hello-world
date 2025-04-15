package com.cognizant.model;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;
@Component
public class Employee {

	private int id;
	private String name;
	private float salary;

	@PostConstruct
	public void init() {
		System.out.println("initialisation starts");
		this.id = 10001;
		this.name = "amrita kaur";
		this.salary = 20000;
	}
	
	public void cleanup() {
		System.out.println("cleanup called");
		
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
