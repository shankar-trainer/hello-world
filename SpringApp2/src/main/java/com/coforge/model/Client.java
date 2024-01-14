package com.coforge.model;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Client {
  
	private long clientId;
	private  String  clientName;
	private int clientAge;
	
	@PostConstruct
	public void init() {
		this.clientId=9899898;
		this.clientName="anand kumar";
		this.clientAge=34;
	}
}
