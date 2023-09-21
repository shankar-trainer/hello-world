package com.example.model;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import lombok.Data;

@Data
@Component
public class Employee {

	 private int employeeId; 
	 private String  employeeName; 
	 private float employeeSalary; 
	 
	 @PostConstruct
	 public void init() {
		 System.out.println("init called");
		 this.employeeId=98989;
		 this.employeeName="aman kumar";
		 this.employeeSalary=12000.0f;
	 }
}
