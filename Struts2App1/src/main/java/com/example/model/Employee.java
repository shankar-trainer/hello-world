package com.example.model;

import com.opensymphony.xwork2.ActionSupport;

public class Employee extends ActionSupport {

	private int empId;
	private String empPass;
	private String empName;
	private float empSalary;
	private String city[];
	private String state[];
	private String gender;
	private String job[];

	public String[] getState() {
		return state;
	}

	public void setState(String[] state) {
		this.state = state;
	}

	public String getEmpPass() {
		return empPass;
	}

	public void setEmpPass(String empPass) {
		this.empPass = empPass;
	}

	public String[] getJob() {
		return job;
	}

	public void setJob(String[] job) {
		this.job = job;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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

	public float getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}

	public String[] getCity() {
		return city;
	}

	public void setCity(String[] city) {
		this.city = city;
	}

	@Override
	public String execute() throws Exception {
		System.out.println(getState()[0] == "");
		System.out.println(getState()[0] );
		//System.out.println(getState()[1] );
		
		if (getEmpId() <= 0) {
			addActionError("emp id is zero or negative");
			return ERROR;
		} else if (getEmpPass().isEmpty() || getEmpPass() == null || getEmpPass() == "") {
			addActionError("emp password is blank ");
			return ERROR;
		} else if (getEmpName().isEmpty() || getEmpName() == null || getEmpName() == "") {
			addActionError("emp name blank");
			return ERROR;
		} else if (getEmpSalary() <= 0) {
			addActionError("emp  salary is  zero or negative");
			return ERROR;
		} else if (getCity() == null || getCity().length == 0) {
			addActionError("select the city");
			return ERROR;
		} else if (getGender() == null || getGender().isEmpty() || getGender() == "") {
			addActionError("select the gender");
			return ERROR;
		} else if (getJob()[0] == "") {
			addActionError("select the job");
			return ERROR;
		} else if (getState()[0] == "") {
			addActionError("select the state");
			return ERROR;
		} else
			return SUCCESS;
	}
}
