package com.audintel.error;

public class User {
	private int userId;
	private String userName;
	private float usersalary;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) throws UserException {
		if (userId <= 0)
			throw new UserException("id can not be zero or -ve");
		else if (userId < 10000 || userId > 50000)
			throw new UserException("id not in the range of 10000 - 50000");
		else
			this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) throws UserException {
		if(userName.isBlank())
			throw new UserException("name is blank");
		else if(userName.length()<5 || userName.length()>20)
			throw new UserException("name length must of 5 - 20 chars ");
		else
		this.userName = userName;
	}

	public float getUsersalary() {
		return usersalary;
	}

	public void setUsersalary(float usersalary) throws UserException {
		if (usersalary <= 0)
			throw new UserException("salary can not be zero or -ve");
		else if (usersalary < 10000 || usersalary > 500000)
			throw new UserException("salary  not in the range of 10000 - 500000");
		else

		this.usersalary = usersalary;
	}

}
