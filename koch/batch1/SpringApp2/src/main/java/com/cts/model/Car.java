package com.cts.model;

import javax.annotation.PostConstruct;

public class Car {

	private int regNo;
	private String model;
	private String location;
	
	@PostConstruct
	public void init() {
		System.out.println("car init called");
		this.regNo=7767676;
		this.model="maruti suzuki";
		this.location="kochhi";
	}
	
	public int getRegNo() {
		return regNo;
	}
	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Car [regNo=" + regNo + ", model=" + model + ", location=" + location + "]";
	}
	
	
	
	
}
