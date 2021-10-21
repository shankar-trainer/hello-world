package org.com.model;

public class Book {

	private int book_isbn;
	private String book_name;
	private float book_cost;
    
	public void init() {
		book_isbn=1;
		book_name="my book";
		book_cost=1;
		System.out.println("init called ");
	}
	public void clean() {
    	System.out.println("destroy  called");
	}	
		
	public Book() {
		System.out.println("default constructor called");
	}

	public Book(int book_isbn, String book_name, float book_cost) {
		super();
		this.book_isbn = book_isbn;
		this.book_name = book_name;
		this.book_cost = book_cost;
		System.out.println("overloaded constructor called");
	}

	@Override
	public String toString() {
		return "Book [book_isbn=" + book_isbn + ", book_name=" + book_name + ", book_cost=" + book_cost + "]";
	}

	 
}
