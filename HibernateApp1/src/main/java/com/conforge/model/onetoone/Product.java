package com.conforge.model.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
//import javax.persistence.PrimaryKeyJoinColumn;

@Entity

public class Product {

	@Id
	@GeneratedValue
	private int productId;
	private String productName;
	private float productCost;
	private int quantity;
	
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	//@PrimaryKeyJoinColumn
	//@JoinColumn(name="product_order_id")
	private Order order;
	
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	//@PrimaryKeyJoinColumn
	//@JoinColumn(name="product_payment_id")
	private Payment payment;

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productCost=" + productCost
				+ ", quantity=" + quantity + ", order=" + order + "]";
	}

}
