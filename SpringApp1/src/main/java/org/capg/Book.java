package org.capg;

public class Book {

	private int isbn;
	private String bname;
	private String author;
	private float price;
	
	private Chapter chapter;

	public Book(int isbn, String bname, String author, float price, Chapter chapter) {
		super();
		this.isbn = isbn;
		this.bname = bname;
		this.author = author;
		this.price = price;
		this.chapter = chapter;
	}

	@Override
	public String toString() {
		return "Book \t\nisbn=" + isbn + "\t\nbname=" + bname + "\t\nauthor=" + author + "\t\nprice=" + price + "\t\n\nchapter="	+ chapter + "]";
	}
	
}
