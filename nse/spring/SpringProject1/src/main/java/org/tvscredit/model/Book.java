package org.tvscredit.model;

public class Book {

	private int isbn;
	private  String  bname;
	private String author;
	private float cost;

	public Book(int isbn, String bname, String author, float cost) {
		super();
		this.isbn = isbn;
		this.bname = bname;
		this.author = author;
		this.cost = cost;
	}
	public int getIsbn() {
		return isbn;
	}
	public String getBname() {
		return bname;
	}
	public String getAuthor() {
		return author;
	}
	public float getCost() {
		return cost;
	}
	
	
	
	
}
