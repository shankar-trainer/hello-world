package org.com.model;

public class Product {

	private int id;
	private String name;
	private float cost;

	public Product(int id, String name, float cost) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
	}
	
	public Product() {
	}
	

	@Override
	public String toString() {
		return "Product Information \nid=" + id + ", \nname=" + name + ", \ncost=" + cost + "]";
	}
	
	
}
