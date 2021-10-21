package com.cts;

public class Book {

	private int isbn;
	private String book_name;
	private String book_author;
	private float cost;
		
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}
	
	public void setCost(float cost) {
		this.cost = cost;
	}
	
	@Override
	public String toString() {
		  return "ISBN is "+isbn
	              +"\nBook Name is "+book_name
	              +"\nBook Author is "+book_author
	              +"\nBook Cost is "+cost;
		//return super.toString();
	}
	
	public static void main(String[] args) {
		Book book=new Book();
		book.setIsbn(122121);
		book.setBook_name("angular in action");
		book.setBook_author(" p kumar ");
		book.setCost(4516.67f);
		
//		System.out.println(book.toString());
		System.out.println(book);
		
	}
	
	
	
}
