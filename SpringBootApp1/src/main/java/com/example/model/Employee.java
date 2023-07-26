package com.example.model;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import lombok.Data;

@Data
@Component
public class Employee {

	private int id;
	private  String name;
	private float salary;
	
	@PostConstruct
	public void init() {
		this.id=7878779;
		this.name="shyam kumar";
		this.salary=90000;
	}
	
}
