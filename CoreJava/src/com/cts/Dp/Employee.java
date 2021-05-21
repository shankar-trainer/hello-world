package com.cts.Dp;

public class Employee {

	private int empId;
	private String  empName;
	
	private Employee() {
		
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
	
	static Employee emp;
	public static Employee getInstance() {
		if(emp==null)
			emp=new Employee();
		return emp;
	}	
	
}
