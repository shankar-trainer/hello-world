package com.montran.bean;

public class Product {

	private int productId;
	private String productName;
	private float  productCost;
	private Order order;
	
	public Product(int productId, String productName, float productCost, Order order) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCost = productCost;
		this.order = order;
	}

	public int getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public float getProductCost() {
		return productCost;
	}

	public Order getOrder() {
		return order;
	}
	
	
	
}
