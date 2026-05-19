package com.example.model;

import com.opensymphony.xwork2.ActionSupport;

public class User extends ActionSupport {

	private int id;
	private String name;
	private String comment;
	private int age;

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}


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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String execute() throws Exception {
		if (getId() <= 0)
			return ERROR;
		else if (getName().isEmpty())
			return ERROR;
		else if (getAge()<=0)
			return ERROR;
		else
			return SUCCESS;
	}

}
