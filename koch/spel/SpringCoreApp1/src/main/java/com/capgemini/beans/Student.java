package com.capgemini.beans;

public class Student {

	private int roll;
	private String name;
	private String subject;
	private Address address;
	
	public void startup() {
		this.roll=88888;
		this.name="kamal partap";
		this.subject="telugu";
		System.out.println("startup called ");
	}
	
	public void cleanup() {
		System.out.println("destroy  called ");
	}
	
	
	@Override
	public String toString() {
		return "Student roll=" + roll + ", name=" + name + ", subject=" + subject + ", address=" + address;
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
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
}
