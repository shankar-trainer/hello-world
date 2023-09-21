package com.coforge.model;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("nuser")
//@Primary
public class NormalUser extends User {

	@PostConstruct
	public void init() {
		 this.setUserId(10001);
		 this.setUserName("amit kumar");
		 this.setUserSalary(20000);
	}
}
