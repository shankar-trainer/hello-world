package edu.chitkara.collection;

public class Book {
	private int isbn;
	private String bname;
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

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}
	
	

}
