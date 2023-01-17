package com.pathinfotech.model;

public class Employee {
	private int empId;
	private String empName;
	private float empSalary;

	public void init() {
		System.out.println(getClass() + " class init called ");
		this.empId = 7788788;
		this.empName = "amit kumar";
		this.empSalary = 24000;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}

}
