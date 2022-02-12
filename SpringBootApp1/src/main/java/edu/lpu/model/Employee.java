package edu.lpu.model;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class Employee {

	private int id;
	private String name;
	private float salary;
	
	@PostConstruct
	public void init() {
		id=1000;
		name="ram kumar";
		salary=67000;
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
