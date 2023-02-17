package com.tvscredit.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {

	@NotNull(message="id is blank")
	
	private Integer userId;
	
	@Size(min=4, max=35,message = "user Name langth should between 4 - 35 character")
	@NotEmpty(message = "User Name is Empty")
	private String userName;
	
	@NotNull(message="Salary is blank")
	@Min(value = 10000,message = "User salary cannot be less than 10000 ")
	@Max(value = 100000,message = "User salary cannot be greateer than  100000 ")
	private Float userSalary;
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Float getUserSalary() {
		return userSalary;
	}
	public void setUserSalary(Float userSalary) {
		this.userSalary = userSalary;
	}

}
