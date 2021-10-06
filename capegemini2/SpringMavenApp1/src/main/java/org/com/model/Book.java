package org.com.model;

public class Book {

	private int book_isbn;
	private String book_name;
	private float book_cost;

	private Story story;

	public Book() {
	}

	public Book(int book_isbn, String book_name, float book_cost, Story story) {
		super();
		this.book_isbn = book_isbn;
		this.book_name = book_name;
		this.book_cost = book_cost;
		this.story = story;
	}

	@Override
	public String toString() {
		return "Book [book_isbn=" + book_isbn + ", book_name=" + book_name + ", book_cost=" + book_cost + ", story="
				+ story + "]";
	}
}
