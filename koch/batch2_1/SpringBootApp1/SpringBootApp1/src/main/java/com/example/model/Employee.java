package com.example.model;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class Employee {

	private int employeeId;
	private  String  employeeName;
	private float  employeeSalary;
	
	@PostConstruct
	public void init() {
		System.out.println("init called ");
		this.employeeId=78787878;
		this.employeeName="amitest kumar";
		this.employeeSalary=20000;
		
		this.employeeId=78787878;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public float getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(float employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + "]";
	}
	
	
}
