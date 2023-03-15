package com.abc.model;

import org.springframework.data.annotation.Id;

public class Customer {

	@Id
	public String id;
	public String userId;

	public String firstName;
	public String lastName;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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

	public Customer() {
	}

	public Customer(String userId, String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.userId = userId;
	}

	@Override
	public String toString() {
		return String.format("Customer[userId=%s, firstName='%s', lastName='%s']", userId, firstName, lastName);
	}

}