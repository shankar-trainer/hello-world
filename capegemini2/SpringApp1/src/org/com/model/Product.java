package org.com.model;

public class Product {

	private int prd_id;
	private String prd_name;
	private float prd_cost;
	
	public Product(int prd_id, String prd_name, float prd_cost) {
		super();
		this.prd_id = prd_id;
		this.prd_name = prd_name;
		this.prd_cost = prd_cost;
	}

	public int getPrd_id() {
		return prd_id;
	}

	public String getPrd_name() {
		return prd_name;
	}

	public float getPrd_cost() {
		return prd_cost;
	}
	
	
	
}
