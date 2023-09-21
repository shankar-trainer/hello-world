package com.coforge.model;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Employee {
	private int empId;
	private String empName;
	private float empSalary;
	
	@PostConstruct
	public void init() {
		this.empId=787790;
		this.empName="suraj babu";
		this.empSalary=34000.0f;
	}

}
