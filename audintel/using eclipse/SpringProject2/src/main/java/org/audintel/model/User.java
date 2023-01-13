package org.audintel.model;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;

@Data
public class User {
	private int userId;
	private String userName;
	private float userSalary;
	
	@Autowired
	private Address userAddress;
	

	@PostConstruct
	public void userInit() {
		this.userId = 989898;
		this.userSalary = 78000;
		this.userName = "prabahs sinha";
		System.out.println("init called ");
	}
}
