package com.cts.model;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Account {
	
	private Integer actId;
	private String actName;

	private Float actBalance;
	private Date actCreationDate;
	
	//@DateTimeFormat(pattern = "dd-MM-yyyy")
	//private LocalDate dob;
	

//	public LocalDate getDob() {
//		return dob;
//	}
//	public void setDob(LocalDate dob) {
//		this.dob = dob;
//	}	
	public Integer getActId() {
		return actId;
	}
	public void setActId(Integer actId) {
		this.actId = actId;
	}
	public String getActName() {
		return actName;
	}
	
	public void setActName(String actName) {
		this.actName = actName;
	}
	public Float getActBalance() {
		return actBalance;
	}
	public void setActBalance(Float actBalance) {
		this.actBalance = actBalance;
	}
	public Date getActCreationDate() {
		return actCreationDate;
	}
	public void setActCreationDate(Date actCreationDate) {
		this.actCreationDate = actCreationDate;
	}

	
}
