package com.cts.model;

public class Product {

	private int pId;
	private String pName;
	private float pCost;
	
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public float getpCost() {
		return pCost;
	}
	public void setpCost(float pCost) {
		this.pCost = pCost;
	}
	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", pCost=" + pCost + "]";
	}
	
	
	
	
}
