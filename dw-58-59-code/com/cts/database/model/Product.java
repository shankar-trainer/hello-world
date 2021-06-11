package com.cts.database.model;

import java.util.Date;

public class Product {

	private int id;
	private String name;
	private float cost;
	private Date mfd;
	
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
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public Date getMfd() {
		return mfd;
	}
	public void setMfd(Date mfd) {
		this.mfd = mfd;
	}
	
	
	
	
}
