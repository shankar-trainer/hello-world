package com.conforge.model.onetoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order1")
public class Order {
	@Id
	@GeneratedValue
	private int orderId;
	private String orderLocation;
	private float totalCost;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderLocation() {
		return orderLocation;
	}

	public void setOrderLocation(String orderLocation) {
		this.orderLocation = orderLocation;
	}

	public float getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(float totalCost) {
		this.totalCost = totalCost;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderLocation=" + orderLocation + ", totalCost=" + totalCost + "]";
	}

}
