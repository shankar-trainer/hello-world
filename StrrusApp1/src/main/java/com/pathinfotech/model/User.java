package com.pathinfotech.model;

import com.opensymphony.xwork2.ActionSupport;

public class User extends ActionSupport {
	private int userId;
	private String userName;
	private float userSalary;
	private String gender;
	private String hobbies[];
	private String city[];

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	public String[] getCity() {
		return city;
	}

	public void setCity(String[] city) {
		this.city = city;
	}


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
			return LOGIN;
		} else if (getUserName().isEmpty()) {
			addFieldError("userName", getText("name.required"));
			return LOGIN;
		} else if (getUserSalary() <= 0) {
			addFieldError("userSalary", getText("salary.required"));
			return LOGIN;
		}

		return SUCCESS;
	}
}
