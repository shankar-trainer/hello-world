package com.coforge.exception;

public class User {

	private int userId;
	private String userName;
	private float userSalary;

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userSalary=" + userSalary + "]";
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) throws UserException {
		if (userId <= 0)
			throw new UserException("id is blank or zero or -ve");
		else	if (userId <1000 || userId>10000)
			throw new UserException("id not in range of 1000 - 10000");
		else
			this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) throws UserException {
		if(userName.isBlank())
			throw new UserException("name is blank or empty");
		else if(userName.length()<5 || userName.length()>15)
			throw new UserException("name must of 5 - 15 chars ");
		this.userName = userName;
	}

	public float getUserSalary() {
		return userSalary;
	}

	public void setUserSalary(float userSalary) throws UserException {
		if(userSalary<=0)
			throw new UserException("salary is blank or empty");
		else if(userSalary<25000 || userSalary>200000)
			throw new UserException("salary must be in range of 25000 - 200000");
		this.userSalary = userSalary;
	}

}
