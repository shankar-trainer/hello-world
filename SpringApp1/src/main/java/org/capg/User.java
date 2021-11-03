package org.capg;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class User {

	private int userId;
	private String userName;
	private int userAge;
	private List<String> prdList;
	private Set<String> locationSet;
	private Map<String, String> userDepartment;
	private Properties userState;
	

	public Properties getUserState() {
		return userState;
	}

	public void setUserState(Properties userState) {
		this.userState = userState;
	}

	public Map<String, String> getUserDepartment() {
		return userDepartment;
	}

	public void setUserDepartment(Map<String, String> userDepartment) {
		this.userDepartment = userDepartment;
	}

	public Set<String> getLocationSet() {
		return locationSet;
	}

	public void setLocationSet(Set<String> locationSet) {
		this.locationSet = locationSet;
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

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public List<String> getPrdList() {
		return prdList;
	}

	public void setPrdList(List<String> prdList) {
		this.prdList = prdList;
	}

}
