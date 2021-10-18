package org.com.model;

import org.springframework.stereotype.Component;

@Component
public class Student {

	private int roll=1001;
	private String name="ram kumar";
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
