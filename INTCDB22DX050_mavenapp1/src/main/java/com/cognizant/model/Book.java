package com.cognizant.model;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

//@Component
public class Book {
	private int isbn;
	private String bname;
	private float cost;

	@PostConstruct 
	public void init() {
		isbn=988998;
		bname="java pro";
		cost=450;
	}
	
	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

}
