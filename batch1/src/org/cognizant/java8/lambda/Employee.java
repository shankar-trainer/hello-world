package org.cognizant.java8.lambda;

public class Employee {
	private String empName;
	private float empSalary;
	private int empId;

	public Employee(int empId,String empName, float empSalary) {
		super();
		this.empName = empName;
		this.empSalary = empSalary;
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public float getEmpSalary() {
		return empSalary;
	}

	public int getEmpId() {
		return empId;
	}

}
