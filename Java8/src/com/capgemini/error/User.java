package com.capgemini.error;

public class User {

	private int userId;
	private String userName;
	private float userSalary;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) throws UserException {
		if (userId <= 0)
			throw new UserException("id is invalid it cannot be zero or -ve ");
		else if (userId < 1000 || userId > 10000)
			throw new UserException("invalid id not in range  1000 - 10000 ");
		else
			this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) throws UserException {
		if (userName.isEmpty())
			throw new UserException(" user name is empty");
		else if (userName.length() < 5 || userName.length() > 12)
			throw new UserException("invalid length  must be 5 - 12 chars ");
		else
			this.userName = userName;
	}

	public float getUserSalary() {
		return userSalary;
	}

	public void setUserSalary(float userSalary) throws UserException {
		if (userSalary <= 0)
			throw new UserException("salary  is invalid it cannot be zero or -ve ");
		else if (userSalary < 10000 || userSalary > 50000)
			throw new UserException("salary not in range  10000 - 50000 ");
		else
			this.userSalary = userSalary;
	}

}
