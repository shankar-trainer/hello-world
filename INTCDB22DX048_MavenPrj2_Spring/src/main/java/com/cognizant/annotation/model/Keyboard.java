package com.cognizant.annotation.model;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;
//@Component
public class Keyboard {

	private int id;
	private String model;
	private  float cost;
	
//	@PostConstruct
	public void init() {
		this.id=9001;
		this.model="hp";
		this.cost=1200;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
