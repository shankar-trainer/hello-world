package com.cts.model;

import java.util.Date;

public class ProductOrder {
	private int orderId;
	private Date orderDate;
	private Date orderDelieveryDate;
	private String orderLocation;
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Date getOrderDelieveryDate() {
		return orderDelieveryDate;
	}
	public void setOrderDelieveryDate(Date orderDelieveryDate) {
		this.orderDelieveryDate = orderDelieveryDate;
	}
	public String getOrderLocation() {
		return orderLocation;
	}
	public void setOrderLocation(String orderLocation) {
		this.orderLocation = orderLocation;
	}

	
}
