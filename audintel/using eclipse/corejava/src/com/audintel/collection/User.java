package com.audintel.collection;

import java.util.Objects;

public class User {
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
	public int hashCode() {
		return Objects.hash(userId, userName, userSalary);
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
		return userId == other.userId && Objects.equals(userName, other.userName)
				&& Float.floatToIntBits(userSalary) == Float.floatToIntBits(other.userSalary);
	}

	
}
