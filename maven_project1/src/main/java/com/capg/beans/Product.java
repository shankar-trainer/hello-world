package com.capg.beans;

public class Product {
     // Product has order 
	
	private int prdId;
	private String prdName;
	private String prdLocation;
	private Order order;
	
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	private float cost;
	
	public int getPrdId() {
		return prdId;
	}
	public void setPrdId(int prdId) {
		this.prdId = prdId;
	}
	public String getPrdName() {
		return prdName;
	}
	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}
	public String getPrdLocation() {
		return prdLocation;
	}
	public void setPrdLocation(String prdLocation) {
		this.prdLocation = prdLocation;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	
	
}
