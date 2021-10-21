package com.capegemini.collection;

public class Book implements Comparable<Book> {

	private int isbn;
	private String name;
	private float cost;
	private String author;

	// int------->Integer

	public Book(int isbn, String name, float cost, String author) {
		super();
		this.isbn = isbn;
		this.name = name;
		this.cost = cost;
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", name=" + name + ", cost=" + cost
				+ ", author=" + author + "]";
	}

	@Override
	public int compareTo(Book o) {
		if (this.cost < o.cost)
			return 1;
		else if (this.cost > o.cost)
			return -1;
		else
			return 0;
		//return o.name.compareTo(this.name);
	}
}
