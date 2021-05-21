package com.cts.collection;

class Employee1 implements Comparable<Employee1> {

	private int empId;
	private String empName;
	private float salary;

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

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee1 o) {
		if (this.empId > o.empId)
			return 1;
		else if (this.empId < o.empId)
			return -1;
		else
			return 0;
	}

}
