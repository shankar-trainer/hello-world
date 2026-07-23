package com.coforge.model;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;


public class Department {

	private int departmentId;
	private String  departmentName;
	private  String departmentLocation;
	
	@PostConstruct
	public void init() {
		System.out.println("department init called");
		 this.departmentId=1;
		 this.departmentLocation="alpha gr noida";
		 this.departmentName="training";
	}
	
	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName
				+ ", departmentLocation=" + departmentLocation + "]";
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
	public String getDepartmentLocation() {
		return departmentLocation;
	}
	public void setDepartmentLocation(String departmentLocation) {
		this.departmentLocation = departmentLocation;
	}


	

}
