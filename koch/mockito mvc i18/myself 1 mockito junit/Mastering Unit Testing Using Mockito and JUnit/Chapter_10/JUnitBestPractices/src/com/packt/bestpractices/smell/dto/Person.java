package com.packt.bestpractices.smell.dto;

import java.util.ArrayList;
import java.util.List;

public class Person {

	private String firstName;
	private String lastName;
	private String middleName;
	private List<Address> addresses = new ArrayList<Address>();
	private String email;
	private String phoneNumber1;
	private String phoneNumber2;
	
	public String getFirstName() {
		return firstName;
	}
	public Person setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}
	
	public Person setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getMiddleName() {
		return middleName;
	}
	public Person setMiddleName(String middleName) {
		this.middleName = middleName;
		return this;
	}
	public List<Address> getAddresses() {
		return addresses;
	}
	public Person setAddresses(List<Address> addresses) {
		this.addresses = addresses;
		return this;
	}
	public String getEmail() {
		return email;
	}
	public Person setEmail(String email) {
		this.email = email;
		return this;
	}
	public String getPhoneNumber1() {
		return phoneNumber1;
	}
	public Person setPhoneNumber1(String phoneNumber1) {
		this.phoneNumber1 = phoneNumber1;
		return this;
	}
	public String getPhoneNumber2() {
		return phoneNumber2;
	}
	public Person setPhoneNumber2(String phoneNumber2) {
		this.phoneNumber2 = phoneNumber2;
		return this;
	}
	
	public void addAddrees(Address anAddress) {
		getAddresses().add(anAddress);
	}
	
}
