package com.cognizant.model;

import java.util.Date;

public class Account {
	private int actId;
	private String actName;
	private float actSalary;
	private Date actCreationDate;

	public int getActId() {
		return actId;
	}

	public void setActId(int actId) {
		this.actId = actId;
	}

	public String getActName() {
		return actName;
	}

	public void setActName(String actName) {
		this.actName = actName;
	}

	public float getActSalary() {
		return actSalary;
	}

	public void setActSalary(float actSalary) {
		this.actSalary = actSalary;
	}

	public Date getActCreationDate() {
		return actCreationDate;
	}

	public void setActCreationDate(Date actCreationDate) {
		this.actCreationDate = actCreationDate;
	}

}
