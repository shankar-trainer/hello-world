package com.coforge.model;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("suser")
public class SpecialUser extends User {

	@PostConstruct
	public void init() {
		 this.setUserId(10002);
		 this.setUserName("sumit kumar");
		 this.setUserSalary(80000);
	}
}
