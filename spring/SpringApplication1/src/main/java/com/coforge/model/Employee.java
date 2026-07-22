package com.coforge.model;

public class Employee {
	private int id;
	private  String name;
	private Address address;// Di with getter, setter
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void init() {
		System.out.println("init called ");
	    this.id=900999;	
	    this.name="sanjay kumar";	
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
}
