package com.conforge.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "emp3")
public class Employee {

	@Id
	@GeneratedValue
	@Column(name = "empid")
	private int employeeId;
	
	@Column(name = "empname",nullable = false, length = 20 )
	private String employeeName;

	@Transient
	@Column(name = "empsalary",nullable = false, length =10, precision = 2 )
	private float employeeSalary;
	
    
	//@Temporal(TemporalType.TIME)
	@Temporal(TemporalType.DATE)
	private Date dob;

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
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

}
