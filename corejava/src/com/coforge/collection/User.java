package com.coforge.collection;

public class User {

	private int userId;
	private  String userName;
	private float  userSalary;
	
	public User(int userId, String userName, float userSalary) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userSalary = userSalary;
	}
	
	@Override
	public String toString() {
		return "\nUser [userId=" + userId + ", userName=" + userName + ", userSalary=" + userSalary + "]";
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
