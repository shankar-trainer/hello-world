package com.cts.model;

import java.time.LocalDate;

public class Employee {
	private int empId;
	private  String empName;
	private LocalDate empDob;
	
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
	public LocalDate getEmpDob() {
		return empDob;
	}
	public void setEmpDob(LocalDate empDob) {
		this.empDob = empDob;
	}
	
	

}
