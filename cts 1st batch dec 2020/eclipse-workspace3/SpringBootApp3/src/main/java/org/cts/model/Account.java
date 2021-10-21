package org.cts.model;

import javax.validation.constraints.NotEmpty;
import  javax.validation.constraints.NotNull;

public class Account {


	@NotNull(message="account id is blank")
	private Integer actId;
	
	//@NotNull(message="account name is blank")
	
	@NotEmpty(message="account name is blank")
	private String  actHolderName;
	
	@NotNull(message="account balance is blank")
	private Float actBalance;
	
	private String hobbies;
	private String gender;

	public String getHobbies() {
		return hobbies;
	}
	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
		
	public Integer getActId() {
		return actId;
	}
	public void setActId(Integer actId) {
		this.actId = actId;
	}
	public String getActHolderName() {
		return actHolderName;
	}
	public void setActHolderName(String actHolderName) {
		this.actHolderName = actHolderName;
	}
	public Float getActBalance() {
		return actBalance;
	}
	public void setActBalance(Float actBalance) {
		this.actBalance = actBalance;
	}
	
	
	
	
	
}
