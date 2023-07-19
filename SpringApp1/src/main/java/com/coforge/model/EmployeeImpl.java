package com.coforge.model;

public class EmployeeImpl implements Employee {

	private int employeeId;
	private String employeeName;
	private float employeeSalary;

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
	public void employeeInfo() {
		System.out.println("Employee Information ");
		System.out.println("\tId is " + getEmployeeId());
		System.out.println("\tName is " + getEmployeeName());
		System.out.println("\tSalary is " + getEmployeeSalary());
	}

}
