package com.nec.io;

/**
 * 
 * @author shankar
 *  
 *  <br>This is Student java bean file
 *  <br>It has attributes roll, name, subject and marks
 *  
 *  
 */


public class Student {

	 private int roll;
	 
	 
	 /**
	  * use fname and lname instead of name
	  * 
	  */
	 @Deprecated
	 private String name;
	 
	 private String subject1;
	 private float marks1;
	 
	 private String subject2;
	 private float marks2;
	 
	 private float total;

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

	public String getSubject1() {
		return subject1;
	}

	public void setSubject1(String subject1) {
		this.subject1 = subject1;
	}

	public float getMarks1() {
		return marks1;
	}

	public void setMarks1(float marks1) {
		this.marks1 = marks1;
	}

	public String getSubject2() {
		return subject2;
	}

	public void setSubject2(String subject2) {
		this.subject2 = subject2;
	}

	public float getMarks2() {
		return marks2;
	}

	public void setMarks2(float marks2) {
		this.marks2 = marks2;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}
	 
	 
	 
}
