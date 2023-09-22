package org.coforge.model;

public class Employee {
	private long empId;
	private String empName;
	private float empSalary;
	private float empPf;
	private float empGrossSalary;

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
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

	public float getEmpPf() {
		return empPf;
	}

	public void setEmpPf(float empPf) {
		this.empPf = empPf;
	}

	public float getEmpGrossSalary() {
		return empGrossSalary;
	}

	public void setEmpGrossSalary(float empGrossSalary) {
		this.empGrossSalary = empGrossSalary;
	}

}
