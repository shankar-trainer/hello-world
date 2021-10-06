package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	 private int isbn;
	 private String book_name;
	 private float book_cost;
	 
	public int getIsbn() {
		return isbn;
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", book_name=" + book_name + ", book_cost=" + book_cost + "]";
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
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
	 
	 
	
	 
	 
}
