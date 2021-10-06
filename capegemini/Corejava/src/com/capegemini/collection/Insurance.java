package com.capegemini.collection;

public class Insurance {
	 private int id;
	 private String name;
	 private float  premium_amount;
	 
	public Insurance(int id, String name, float premium_amount) {
		super();
		this.id = id;
		this.name = name;
		this.premium_amount = premium_amount;
	}

	@Override
	public String toString() {
		return "Insurance [id=" + id + ", name=" + name + ", premium_amount="
				+ premium_amount + "]";
	}
	 
		 
	 
	 
	
	
	
}
