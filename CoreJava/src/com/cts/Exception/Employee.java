package com.cts.Exception;

public class Employee {

	private int empId;
	private String empName;
	private float empSalary;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) throws EmployeeException {
		if(empId<=0)
			throw new EmployeeException("empId is invalid");
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) throws EmployeeException {
		if(empName.isEmpty())
			throw new EmployeeException("empName is invalid");
		this.empName = empName;
	}
	public float getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(float empSalary) throws EmployeeException {
		if(empSalary<=0)
			throw new EmployeeException("empSalary  is invalid");
		this.empSalary = empSalary;
	}
}
