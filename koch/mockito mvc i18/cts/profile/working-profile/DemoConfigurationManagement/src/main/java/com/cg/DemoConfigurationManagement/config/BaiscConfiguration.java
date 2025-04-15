package com.cg.DemoConfigurationManagement.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("basic")
public class BaiscConfiguration {
	
	private String message;
	private String mode;
	public BaiscConfiguration() {
		// TODO Auto-generated constructor stub
	}
	public BaiscConfiguration(String message, String mode) {
		super();
		this.message = message;
		this.mode = mode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	

}
