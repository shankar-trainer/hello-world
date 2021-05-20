package com.cts.model;

import javax.annotation.PostConstruct;

public class Student {

	private int studentId;
	private String studentName;
	private float studentMarks;
	
	@PostConstruct
	public void init() {
		System.out.println("2.student init called ");
	  studentId=777;
	  studentName="ramesh";
	  studentMarks=69;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public float getStudentMarks() {
		return studentMarks;
	}

	public void setStudentMarks(float studentMarks) {
		this.studentMarks = studentMarks;
	} 
	 
}
