package com.packt.database.model;

import java.io.Serializable;

public class PhoneEntry implements Serializable {

	private static final long serialVersionUID = 1L;

	private String phoneNumber;
	private String firstName;
	private String lastName;

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
