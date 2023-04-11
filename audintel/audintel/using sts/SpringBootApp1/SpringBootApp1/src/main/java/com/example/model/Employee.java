package com.example.model;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Employee {

	private int id;
	private String name;
	private float salary;

	@PostConstruct
	public void start() {
		System.out.println("startup called");
		this.id = 7887878;
		this.name = "shyam kumar";
		this.salary = 12000;
	}

	public void clean() {
		this.id = 0;
		this.name = null;
		this.salary = 0;
		System.out.println("clean called");
	}
	
	public void employeeInfo() {
		System.out.println("Employee Information");
		System.out.println("\tId "+getId());
		System.out.println("\tName "+getName());
		System.out.println("\tSalary "+getSalary());
	}
}
