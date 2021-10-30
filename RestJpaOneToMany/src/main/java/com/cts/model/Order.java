package com.cts.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "order1")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int orderId;
	private String  orderName;
	private String  orderLocation;
	private float  orderCost;

	@OneToMany//(targetEntity = Product.class)
	private Set<Product> prdSet=new HashSet<Product>();

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public String getOrderLocation() {
		return orderLocation;
	}

	public void setOrderLocation(String orderLocation) {
		this.orderLocation = orderLocation;
	}

	public float getOrderCost() {
		return orderCost;
	}

	public void setOrderCost(float orderCost) {
		this.orderCost = orderCost;
	}

	public Set<Product> getPrdSet() {
		return prdSet;
	}

	public void setPrdSet(Set<Product> prdSet) {
		this.prdSet = prdSet;
	}

	
}
