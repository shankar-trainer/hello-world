package org.com.model;

public class Book {

	private int book_isbn;
	private String book_name;
	private float book_cost;
	
	
	public int getBook_isbn() {
		return book_isbn;
	}
	public void setBook_isbn(int book_isbn) {
		this.book_isbn = book_isbn;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public float getBook_cost() {
		return book_cost;
	}
	public void setBook_cost(float book_cost) {
		this.book_cost = book_cost;
	}
	@Override
	public String toString() {
		return "Book [book_isbn=" + book_isbn + ", book_name=" + book_name + ", book_cost=" + book_cost + "]";
	} 
	
	
	
}
