package com.coforge.model;

import java.util.Objects;

public class Book {

	private int isbn;
	private  String name;
	private  float cost;
	private  String type;
	private  float discount;
	
	public Book(int isbn, String name, float cost, String type, float discount) {
		super();
		this.isbn = isbn;
		this.name = name;
		this.cost = cost;
		this.type = type;
		this.discount = discount;
	}
	
	
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}


	@Override
	public int hashCode() {
		return Objects.hash(cost, discount, isbn, name, type);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Float.floatToIntBits(cost) == Float.floatToIntBits(other.cost)
				&& Float.floatToIntBits(discount) == Float.floatToIntBits(other.discount) && isbn == other.isbn
				&& Objects.equals(name, other.name) && Objects.equals(type, other.type);
	}
	
	
	
	
	
	
	
}