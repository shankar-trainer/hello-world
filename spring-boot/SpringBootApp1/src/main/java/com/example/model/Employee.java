package com.example.model;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class Employee {
	
	private int id;
	private String name;
	private float salary;
	
	@PostConstruct
	public void init() {
		this.id=10001;
		this.name="suresh kumar";
		this.salary=2000;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
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
