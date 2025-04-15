package com.capgemini.beans;

public class Product {

	private int prdId;
	private String  prdName;
	private float prdCost;
	
	
	@Override
	public String toString() {
		return "Product prdId=" + prdId + ", prdName=" + prdName + ", prdCost=" + prdCost;
	}
	
	public void setPrdId(int prdId) {
		this.prdId = prdId;
	}
	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}
	public void setPrdCost(float prdCost) {
		this.prdCost = prdCost;
	}
	

	
}
