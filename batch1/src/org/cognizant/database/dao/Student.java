package org.cognizant.database.dao;

import java.util.Date;

public class Student {

	private int roll;
	private String name;
	private String subject;
	private float marks;
	private Date dob;
	
	public Student(int roll, String name, String subject, float marks, Date dob) {
		super();
		this.roll = roll;
		this.name = name;
		this.subject = subject;
		this.marks = marks;
		this.dob = dob;
	}
	public int getRoll() {
		return roll;
	}
	public String getName() {
		return name;
	}
	public String getSubject() {
		return subject;
	}
	public float getMarks() {
		return marks;
	}
	public Date getDob() {
		return dob;
	}
	
	
	
	
}
