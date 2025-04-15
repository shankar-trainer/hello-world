package com.cts.model;

import java.time.LocalDate;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Department {

	private int departmentId;
	private  String departmentName;
	private LocalDate departmentStartDate;
	
	@Autowired
	@Qualifier("getRegularEmployee")
	private Employee employee;
	
	@PostConstruct
	public void init() {
		this.departmentId=899898;
		this.departmentName="Employee Department";
		this.departmentStartDate=LocalDate.of(2000, 11, 30);
	}


	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName
				+ ", departmentStartDate=" + departmentStartDate + "]";
	}


	public int getDepartmentId() {
		return departmentId;
	}


	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}


	public String getDepartmentName() {
		return departmentName;
	}


	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}


	public LocalDate getDepartmentStartDate() {
		return departmentStartDate;
	}


	public void setDepartmentStartDate(LocalDate departmentStartDate) {
		this.departmentStartDate = departmentStartDate;
	}


	public Employee getEmployee() {
		return employee;
	}


	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
}
