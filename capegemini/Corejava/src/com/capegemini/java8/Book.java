package com.capegemini.java8;

public class Book {
	private int isbn;
	private String name;
	private float cost;

	public Book(int isbn, String name, float cost) {
		super();
		this.isbn = isbn;
		this.name = name;
		this.cost = cost;
	}

	void bookInfo() {
		System.out.println("Book Info");
		System.out.println("isbn is "+isbn);
		System.out.println("name is "+name);
		System.out.println("cost is "+cost);
	}

	float actualCost() {
		return cost;
	}

}
