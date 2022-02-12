package org.lpu.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Employee {

	private int id;
	private  String name;
	private float salary;
	
	@PostConstruct
	public void init() {
		 id=10001;
		 name="saurabh sharma";
		 salary=90000;
		System.out.println("initialisation ....");
	}
	@PreDestroy
	public void cleanup() {
		System.out.println("destroy called  ....");
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
