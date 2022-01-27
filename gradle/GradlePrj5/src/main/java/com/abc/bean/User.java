package com.abc.bean;

public class User {

	private int userId;
	private  String  userName;
	private float  userSalary;
	private String userLocation;
	
	public User(int userId, String userName, float userSalary, String userLocation) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userSalary = userSalary;
		this.userLocation = userLocation;
	}
	
	public int getUserId() {
		return userId;
	}
	public String getUserName() {
		return userName;
	}
	public float getUserSalary() {
		return userSalary;
	}
	public String getUserLocation() {
		return userLocation;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + userId;
		result = prime * result + ((userLocation == null) ? 0 : userLocation.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		result = prime * result + Float.floatToIntBits(userSalary);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (userId != other.userId)
			return false;
		if (userLocation == null) {
			if (other.userLocation != null)
				return false;
		} else if (!userLocation.equals(other.userLocation))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		if (Float.floatToIntBits(userSalary) != Float.floatToIntBits(other.userSalary))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userSalary=" + userSalary + ", userLocation="
				+ userLocation + "]";
	}
	
	
}
