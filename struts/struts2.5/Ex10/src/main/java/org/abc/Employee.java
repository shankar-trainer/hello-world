package org.abc;

import com.opensymphony.xwork2.ActionSupport;

public class Employee extends ActionSupport {

	private int empId;
	private String empName;

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

	@Override
	public void validate() {
		if (getEmpId() <= 0) {
			addFieldError("empId", "id is blank");
		} else if (getEmpName() == null || getEmpName().equals("")) {
			addFieldError("empName", "name is blank");
		}

	}

	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}
/*
	@Override public String execute1() //throws Exception 
	{ 
		if (getEmpId() <= 0) {
	// addActionMessage(" employee id is blank"); 
		addFieldError("empId", "id is blank"); 
		return ERROR; 
		} 
	else if (getEmpName() == null || getEmpName().equals("")) 
	{ 
		addFieldError("empName", "name is blank"); //
	  //addActionMessage("employee name is blank "); return ERROR; } else return
	  SUCCESS; 
	}
*/
}
