package com.abc;

import javax.annotation.PostConstruct;

import lombok.Data;

@Data
public class Student {

	private int roll;
	private String name;
	private String subject;
	private float marks;
	
	
	@PostConstruct
	public void initStudent() {
		this.roll=89998;
		this.name="kunal singh";
		this.subject="mathematics";
		this.marks=78.555f;
	}
	
	
}
