package com.capgemini.collection;

public class Product {

	private int prdId;
	private String  prdName;
	private float  prdCost;
	
	public Product(int prdId, String prdName, float prdCost) {
		super();
		this.prdId = prdId;
		this.prdName = prdName;
		this.prdCost = prdCost;
	}

	@Override
	public String toString() {
		return "Product \tprdId=" + prdId + ", prdName=" + prdName + ", prdCost=" + prdCost;
	}

	public int getPrdId() {
		return prdId;
	}

	public String getPrdName() {
		return prdName;
	}

	public float getPrdCost() {
		return prdCost;
	}

	
}
