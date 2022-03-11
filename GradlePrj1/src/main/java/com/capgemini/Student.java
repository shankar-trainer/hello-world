package com.capgemini;

public class Student {

	private int roll;
	private String name;
	private  float engMarks;
	private  float mathMarks;
	private  float scienceMarks;
	
	public float totalMarks() {
		return engMarks+mathMarks+scienceMarks;
	}
	public float avgMarks() {
		return (engMarks+mathMarks+scienceMarks)/3;
	}
	
	
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
	public float getEngMarks() {
		return engMarks;
	}
	public void setEngMarks(float engMarks) {
		this.engMarks = engMarks;
	}
	public float getMathMarks() {
		return mathMarks;
	}
	public void setMathMarks(float mathMarks) {
		this.mathMarks = mathMarks;
	}
	public float getScienceMarks() {
		return scienceMarks;
	}
	public void setScienceMarks(float scienceMarks) {
		this.scienceMarks = scienceMarks;
	}
	
	
}
