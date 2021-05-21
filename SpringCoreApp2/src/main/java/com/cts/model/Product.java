package com.cts.model;

public class Product {
	private int prdId;
	private String prdName;
	private float prdCost;

	private ProductOrder prdOrder;

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

	public float getPrdCost() {
		return prdCost;
	}

	public void setPrdCost(float prdCost) {
		this.prdCost = prdCost;
	}

	public ProductOrder getPrdOrder() {
		return prdOrder;
	}

	public void setPrdOrder(ProductOrder prdOrder) {
		this.prdOrder = prdOrder;
	}
}
