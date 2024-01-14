package com.example.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.Data;

@Data
@Component
@PropertySource("employee.properties")
public class Employee {

//	@Value("10001")
	@Value("${emp.id}")
	private int id;
	@Value("${emp.name}")
	// @Value("suresh kumar")
	private String name;
	@Value("${emp.salary}")
	// @Value("90000")
	private float salary;

	@PostConstruct
	public void init() {
		System.out.println("init called ");
//	 this.id=98998;	
//	 this.name="suman kumar";
//	 this.salary=90000.0f;
	}

	@PreDestroy
	public void clean() {
		System.out.println("destroy called");
	}

}
