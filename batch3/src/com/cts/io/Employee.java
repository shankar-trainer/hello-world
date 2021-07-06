package com.cts.io;

import java.io.Serializable;

public class Employee  implements Serializable{

	private transient int empId;
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
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	
	
}
