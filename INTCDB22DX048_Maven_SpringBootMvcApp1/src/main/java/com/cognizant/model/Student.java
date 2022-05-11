package com.cognizant.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class Student {
	@NotNull(message = "roll is null")
	@Max(message = "roll cannot be greater than 10000" , value = 10000)
	@Min(message = "roll cannot be less than 1000" , value = 1000)
	private Integer roll;
	
	@NotBlank(message="name is blank")
	private String name;
	
	@NotBlank(message="subject is blank")
	private String subject;

	public Integer getRoll() {
		return roll;
	}

	public void setRoll(Integer roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	

}
