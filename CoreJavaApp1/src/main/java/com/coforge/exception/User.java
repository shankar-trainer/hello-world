package com.coforge.exception;

public class User {
	private int userId;
	private String userName;
	private float userSalary;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) throws UserException {
		if (userId <= 0)
			throw new UserException("invalid user id");
		else if (userId < 5000 || userId > 10000)
			throw new UserException("invalid user id\nmust be in range of 5000 - 10000");

		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) throws UserException {
		if (userName.isBlank())
			throw new UserException("invalid user name\nit is blank or empty");

		else if (userName.length() < 5 || userName.length() > 15)
			throw new UserException("invalid user name\nlength must be of 5 -15 chars");
		this.userName = userName;
	}

	public float getUserSalary() {
		return userSalary;
	}

	public void setUserSalary(float userSalary) throws UserException {
		if (userSalary < 0)
			throw new UserException("invalid user salary\ncan not be -ve  ");
		else if (userSalary < 5000 || userSalary > 200000)
			throw new UserException("invalid user salary\nmust be between 5000 -200000 ");
		else
			this.userSalary = userSalary;
	}

}
