package com.cts.collection;

public class User {

	private int userId;
	private String userName;
	private String userLocation;
	
	private User() {
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
	public String getUserLocation() {
		return userLocation;
	}
	public void setUserLocation(String userLocation) {
		this.userLocation = userLocation;
	}
	
	static User user;
	
	static User getInstance() {
		if(user==null)
			user=new User();
		return user;
	}
	
}
