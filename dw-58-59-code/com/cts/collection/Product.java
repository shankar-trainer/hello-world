package com.cts.collection;

public class Product {

	private int prdId;
	private String prdName;
	private Float prdCost;

	public Product(int prdId, String prdName, Float prdCost) {
		super();
		this.prdId = prdId;
		this.prdName = prdName;
		this.prdCost = prdCost;
	}

	int getPrdId() {
		return prdId;
	}

	String getPrdName() {
		return prdName;
	}

	Float getPrdCost() {
		return prdCost;
	}

	@Override
	public String toString() {
		return "Product [prdId=" + prdId + ", prdName=" + prdName + ", prdCost=" + prdCost + "]";
	}

}
