package com.cognizant.annotation.model;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class Bike {

	private int regNo;
	private String model;
	private float cost;

	@PostConstruct
	public void start_bike() {
		this.regNo=78787778;
		this.model="hero shine";
		this.cost=67000;
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
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	
	
}
