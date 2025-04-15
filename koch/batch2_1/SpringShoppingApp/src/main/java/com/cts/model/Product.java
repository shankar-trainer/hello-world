package com.cts.model;

import org.springframework.stereotype.Component;

@Component
public class Product {

	private int Id;
	private  String name;
	private float cost;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
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
	@Override
	public String toString() {
		return "Product [Id=" + Id + ", name=" + name + ", cost=" + cost + "]";
	}
	
	
}
