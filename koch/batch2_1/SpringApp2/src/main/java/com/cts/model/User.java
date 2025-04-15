package com.cts.model;

import javax.annotation.PostConstruct;

public class User {

	private int userId;
	private  String userName;
	private int userAge;
	
	@PostConstruct
	public void init() {
		System.out.println("user init called ...");
		
		this.userId=878787;
		this.userName="suamn kumar";
		this.userAge=25;
	}
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userAge=" + userAge + "]";
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
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	
	
	
}
