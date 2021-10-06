package org.com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name="book1")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int isbn;
	private String book_name;
	private float book_cost;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", book_name=" + book_name + ", book_cost=" + book_cost + "]";
	}


	public Book(String book_name, float book_cost) {
		super();
	
		this.book_name = book_name;
		this.book_cost = book_cost;
	}
	
	
	
}
