package com.tvscredit.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	private int id;
	private String name;
	private float salary;
	
	@PostConstruct
	public void init() {
		System.out.println("init called");
		id=98898;
		name="madan kumar";
		salary=28000;
	}
	
	@PreDestroy
	public void cleanup() {
		System.out.println("destroy called");
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
