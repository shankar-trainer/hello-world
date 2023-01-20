package com.pathinfotech.model;

import com.opensymphony.xwork2.ActionSupport;

public class User extends ActionSupport {
	private int userId;
	private String userName;
	private float userSalary;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public float getUserSalary() {
		return userSalary;
	}

	public void setUserSalary(float userSalary) {
		this.userSalary = userSalary;
	}

	@Override
	public String execute() throws Exception {
//		if(getUserSalary()<=0||  getUserId()<=0|| getUserName().isEmpty())
//		{ 
//			this.addActionError("error");
//			return ERROR;
//		}
		if (getUserId() <= 0) {
			addFieldError("userId", getText("id.required"));
			return ERROR;
		} else if (getUserName().isEmpty()) {
			addFieldError("userName", getText("name.required"));
			return ERROR;
		} else if (getUserSalary() <= 0) {
			addFieldError("userSalary", getText("salary.required"));
			return ERROR;
		}

		return SUCCESS;
	}
}
