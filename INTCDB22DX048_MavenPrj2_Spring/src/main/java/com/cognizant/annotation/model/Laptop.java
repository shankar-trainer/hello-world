package com.cognizant.annotation.model;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value = "laptop1")
public class Laptop {

	private int regNo;
	private String Model;
	private float cost;
	
	@PostConstruct
	public void init() {
		this.regNo=9898989;
		this.Model="dell";
		this.cost=56000;
	}
	
	@Autowired
	@Qualifier(value = "keyboard1")
	private Keyboard keyboard;

	public int getRegNo() {
		return regNo;
	}

	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public Keyboard getKeyboard() {
		return keyboard;
	}

	public void setKeyboard(Keyboard keyboard) {
		this.keyboard = keyboard;
	}

	
}
