package com.capgemini.mybook.dto;

public class Login {

	private String id;
	private String password;
	private String userType;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	
	public Login() {
	}
	
	public Login(String id, String password, String userType) {
		super();
		this.id = id;
		this.password = password;
		this.userType = userType;
	}
	
}
