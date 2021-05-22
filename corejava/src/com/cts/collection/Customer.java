package com.cts.collection;

public class Customer {

	private int id;
	private String name;
	private float cost;
	private String product;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", cost=" + cost + ", product=" + product + "]";
	}
	
}
