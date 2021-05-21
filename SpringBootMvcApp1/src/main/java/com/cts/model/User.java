package com.cts.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


public class User {
	
	@NotNull(message="userId is blank")
	@Min(value = 10000)
	@Max(value = 20000)
	private Integer userId;
	
	@NotEmpty(message = "user name is empty")
	//@NotBlank(message = "user name is blank")
	//@Min(value = 10,message="min length is 10 chars")
	private String userName;

	@NotNull
	@Min(value = 10000)
	private Float  userSalary;
	
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
