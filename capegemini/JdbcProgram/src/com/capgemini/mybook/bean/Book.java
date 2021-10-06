package com.capgemini.mybook.bean;

public class Book {
	private int isbn;
	private String book_name;
	private float cost;
	private String book_author;
	
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", book_name=" + book_name + ", cost=" + cost + ", book_author=" + book_author
				+ "]";
	}
	public Book() {
	}
	
	public Book(int isbn, String book_name, float cost, String book_author) {
		super();
		this.isbn = isbn;
		this.book_name = book_name;
		this.cost = cost;
		this.book_author = book_author;
	}
	public int getIsbn() {
		return isbn;
	}
	public String getBook_name() {
		return book_name;
	}
	public float getCost() {
		return cost;
	}
	public String getBook_author() {
		return book_author;
	}
	
	
	
	

}
