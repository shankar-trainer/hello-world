package com.capgemini.beans.annotation;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component(value =   "bike1")
public class Bike {

	private int regNo;
	private String model;
	private float cost;

	@PostConstruct
	public void start() {
		this.regNo = 89988998;
		this.model = "honda shine";
		this.cost = 78000.00f;
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
