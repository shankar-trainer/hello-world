package com.pathinfotech.model;

import com.opensymphony.xwork2.ActionSupport;

public class User extends ActionSupport {

	private int id;
	private String name;
	private float salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String execute() throws Exception {
		if (getId() <= 0) {
			System.out.println("id  error ");
			addFieldError("id", "id.error");
			return INPUT;
		} else if (getName().isEmpty()) {
			addFieldError("name", "name.error");
			return INPUT;
		} else if (getSalary() <= 0) {
			addFieldError("salary", "salary.error");
			return INPUT;
		} else
			return SUCCESS;
	}

}
