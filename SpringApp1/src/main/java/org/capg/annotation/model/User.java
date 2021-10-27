package org.capg.annotation.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
//(value = "user1")
public class User {

	private int userId;
	private String  userName;
	private float userSalary;

	@PostConstruct
	public void initialise() {
	  System.out.println("user initialisation called ");	
	  userId=78878;
	  userName="pavitra";
	  userSalary=56000;
	}
	
	@PreDestroy
	public void cleanup() {
		System.out.println("user destroy called ");	
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
	public float getUserSalary() {
		return userSalary;
	}
	public void setUserSalary(float userSalary) {
		this.userSalary = userSalary;
	}
	
	
}
