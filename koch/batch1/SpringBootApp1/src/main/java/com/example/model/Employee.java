package com.example.model;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Component
@Getter
@ToString
@Setter

public class Employee {

	private int empId;
	private String empName;
	private  float empSalary;
	
	@PostConstruct
	public void init() {
		this.empId=89898;
		this.empName="suresh kumar";
		this.empSalary=78000;
	}
	
		
	
}
