package com.cts;

public class User {

	private int UserId;
	private String UserName;
	private String UserLocation;
	private float UserSalary;

	public int getUserId() {
		return UserId;
	}

	public void setUserId(int userId) throws UserException {
		if (userId < 10000)
			throw new UserException("invalid  id must be >= 10000 ");
		else
			UserId = userId;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) throws UserException {
		if (userName.isEmpty())
			throw new UserException("name is empty ");

		else if (userName.length() < 10)
			throw new UserException("name length must be >=10 chars ");
		else
			UserName = userName;
	}

	public String getUserLocation() {
		return UserLocation;
	}

	public void setUserLocation(String userLocation) {
		UserLocation = userLocation;
	}

	public float getUserSalary() {
		return UserSalary;
	}

	public void setUserSalary(float userSalary) throws UserException {
		if (userSalary <= 0)
			throw new UserException(" salary cannot be zero or -ve ");

		else if (userSalary < 10000)

			throw new UserException(" salary cannot be less than 100000");
		else
			UserSalary = userSalary;
	}

}
