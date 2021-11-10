package org.capg.model;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class Employee {

	private int id;
	private String name;
	private  float salary;
	
	@PostConstruct
	public void init() {
		System.out.println("init called ");
		id=10001;
		name="amrita kaur";
		salary=90000.00f;
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
