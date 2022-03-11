package com.capgemini;

import java.util.Objects;

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
	
	
	@Override
	public int hashCode() {
		return Objects.hash(engMarks, mathMarks, name, roll, scienceMarks);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Float.floatToIntBits(engMarks) == Float.floatToIntBits(other.engMarks)
				&& Float.floatToIntBits(mathMarks) == Float.floatToIntBits(other.mathMarks)
				&& Objects.equals(name, other.name) && roll == other.roll
				&& Float.floatToIntBits(scienceMarks) == Float.floatToIntBits(other.scienceMarks);
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
