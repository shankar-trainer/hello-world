package org.cognizant.file;

import java.io.Serializable;

public class Employee  implements Serializable{
	private int employeeId;
	private String employeeName;
	private float employeeSalary;

	public Employee(int employeeId, String employeeName, float employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + "]";
	}

}
