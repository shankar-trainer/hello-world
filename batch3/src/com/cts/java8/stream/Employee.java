package com.cts.java8.stream;

public class Employee {
	private int empId;
	private String empName;
	private float empSalary;

	public Employee(int empId, String empName, float empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public float getEmpSalary() {
		return empSalary;
	}

}
