package com.coforge.collection;

public class Employee implements Comparable<Employee> {

	private int employeeId;
	private String employeeName;
	private float employeeSalary;

	@Override
	public String toString() {
		return "\n\nEmployee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + "]";
	}

	public Employee(int employeeId, String employeeName, float employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
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
	public int compareTo(Employee o) {
		if (this.employeeId > o.employeeId)
			return 1;

		else if (this.employeeId < o.employeeId)
			return -1;
		else
			return 0;

	}

}
