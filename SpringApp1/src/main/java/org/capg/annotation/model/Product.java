package org.capg.annotation.model;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Product {
	private int productId;
	private String productName;
	private float productCost;
	
	@PostConstruct
	public void init() {
		productId=87779;
		productName="pizza";
		productCost=500;
		order.setOrderId(1);
		order.setOrderName("pizza delivery");
		order.setOrderCost(550);
	}

	@Autowired
	private Order order;

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public float getProductCost() {
		return productCost;
	}

	public void setProductCost(float productCost) {
		this.productCost = productCost;
	}

}
