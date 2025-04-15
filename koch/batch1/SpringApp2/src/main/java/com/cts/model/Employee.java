package com.cts.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	private int employeeId;
	private  String employeeName;
	private  float employeeSalary;
	
	@Autowired
	private Car car;
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + ", car=" + car + "]";
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
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
	
	
	
	@PostConstruct
	public void init() {
		System.out.println("Employee bean init called");
		this.employeeId=87878787;
		this.employeeName="ramesh kumar";
		this.employeeSalary=45000.56F;
	}
	
	@PreDestroy
	public void close() {
		System.out.println("Employee bean destroy called ");
	}
	
}
