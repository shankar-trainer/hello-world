package com.capgemini.model;

import com.capgemini.error.StudentException;

public class Student {

	private int roll;
	private String name;
	private float marks;
	private String subject;

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) throws StudentException {
		if (roll <= 0)
			throw new StudentException("roll is negative");
		else if (roll < 1000 || roll > 10000)
			throw new StudentException("roll  is not in range  1000 - 10000");
		else
			this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws StudentException {
		if (name.isEmpty())
			throw new StudentException("name can't be empty");
		else if (name.length() < 5 || name.length() > 15)
			throw new StudentException("name length must be 5 -- 15");
		else
			this.name = name;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) throws StudentException {
		if (marks <= 0)
			throw new StudentException("marks is negative");
		else if (marks <0 || roll > 100)
			throw new StudentException("marks  not in range  0 - 100");
		this.marks = marks;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) throws StudentException {
		if (subject.isEmpty())
			throw new StudentException("subject can't be empty");
		else if (subject.length() < 5 || subject.length() > 15)
			throw new StudentException("subject length must be 5 -- 15 chars");
		else
		this.subject = subject;
	}

}
