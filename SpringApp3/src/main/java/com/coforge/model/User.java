package com.coforge.model;

import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import lombok.Data;

@Component
@Data
public class User {

	private long userId;
	private  String userName;
	private  float userSalary;
	
//	@PostConstruct
//	public void init() {
//		this.userId=9889898;
//		this.userName="parshant kumar";
//		this.userSalary=78000;
//	}
}
