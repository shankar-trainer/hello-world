package com.capgemini.beans;

public class Department {

	private int departmentId;
	private String  departmentName;
	private String departmentLocation;
	public Department(int departmentId, String departmentName, String departmentLocation) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.departmentLocation = departmentLocation;
	}
	@Override
	public String toString() {
		return "Department departmentId=" + departmentId + ", departmentName=" + departmentName
				+ ", departmentLocation=" + departmentLocation;
	}
	
}
