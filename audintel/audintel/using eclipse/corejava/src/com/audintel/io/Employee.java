package com.audintel.io;

import java.io.Serializable;

public class Employee  implements Serializable{

	 private long empId;
	 private String empName;
	 private double empSalary;
	 private  transient String  empLocation;// transient variable is not serialized
	  static String state="new delhi";
	 
	public Employee(long empId, String empName, double empSalary, String empLocation) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empLocation = empLocation;
	}
	
	public long getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public String getEmpLocation() {
		return empLocation;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empLocation="
				+ empLocation + ",state="+state+" ]";
	}
	
	
	 
}
