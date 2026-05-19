package com.montran.bean;

public class Order {

	private int orderId;
	private String orderLocation;

	public Order(int orderId, String orderLocation) {
		super();
		this.orderId = orderId;
		this.orderLocation = orderLocation;
	}

	public int getOrderId() {
		return orderId;
	}

	public String getOrderLocation() {
		return orderLocation;
	}

}
