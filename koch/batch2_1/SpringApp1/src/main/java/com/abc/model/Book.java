package com.abc.model;

public class Book {
	private int isbn;
	private String bname;
	private float cost;

	public Book(int isbn, String bname, float cost) {
		super();
		this.isbn = isbn;
		this.bname = bname;
		this.cost = cost;
	}

	public void cleanup() {
		System.out.println("cleanup called");
	}

	public void init() {
		System.out.println("init called in Book");
		this.isbn = 87878787;
		this.bname = "hibernate in action";
		this.cost = 1700;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", bname=" + bname + ", cost=" + cost + "]";
	}

	public int getIsbn() {
		return isbn;
	}

	public String getBname() {
		return bname;
	}

	public float getCost() {
		return cost;
	}

}
