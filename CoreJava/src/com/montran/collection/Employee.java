package com.montran.collection;

public class Employee {
	private int employeeId;
	private String employeeName;
	private float employeeSalary;

	public Employee(int employeeId, String employeeName, float employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public float getEmployeeSalary() {
		return employeeSalary;
	}

}
