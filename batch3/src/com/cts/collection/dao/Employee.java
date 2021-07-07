package com.cts.collection.dao;

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

	@Override
	public String toString() {
		return "Employee [\nempId=" + empId + ", \nempName=" + empName + ", \nempSalary=" + empSalary + "]";
	}

}
