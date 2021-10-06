package org.com.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Employee {
		
	private int id;
	private String name;
	
	@PostConstruct
	public void init() {
		id=1001;
		name="mohan kumar";
	System.out.println("init called");
	}
	
	@PreDestroy
	public void cleanup() {
		System.out.println("destroy called");
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
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
	

}
