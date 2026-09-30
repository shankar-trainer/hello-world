package com.cts.model;

import java.util.Objects;
/**
 * 
 * User class contains three attributes
 * 
 */
public class User {

	private int userId;
	private String userName;
	private int userAge;

	public User(int userId, String userName, int userAge) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userAge = userAge;
	}

	public int getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public int getUserAge() {
		return userAge;
	}

	@Override
	public int hashCode() {
		return Objects.hash(userAge, userId, userName);
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
		return userAge == other.userAge && userId == other.userId && Objects.equals(userName, other.userName);
	}

	
}
