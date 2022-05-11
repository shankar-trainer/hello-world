package com.cognizant.model;

//import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;
@Component
public class Employee {

	private int id;
	private String name;
	private float salary;
	
//	@PostConstruct
	public void init() {
		id=10001;
		name="ramesh kumar";
		salary=90000;
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
