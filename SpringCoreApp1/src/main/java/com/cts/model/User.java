package com.cts.model;

import javax.annotation.PostConstruct;

public class User {

	private int userId;
	private String userName;
	private float userSalary;
	
	@PostConstruct
	public void init() {
		System.out.println("user init called ");
	  userId=333;
	  userName="harmesh";
	  userSalary=9999;
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
  
}
