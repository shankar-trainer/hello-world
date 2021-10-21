package org.com.model;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;

@Entity
@Table(name="book4")
public class Book {

	@Id
	@Column(name="book_isbn")
	private int isbn;
	
	@Column(name="bname", nullable=false, length=20)
		private String book_name;
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", book_name=" + book_name + ", book_author=" + book_author + ", cost=" + cost
				+ ", publisher=" + publisher + "]";
	}
	
	@Column(name="bauthor", nullable=false, length=20)
	private String book_author;
	
	@Column(name="book_cost", nullable=false)
	private float cost;
	@Column(name="book_publisher", nullable=false, length=20)
	private String publisher;
		
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public int getIsbn() {
		return isbn;
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
	public String getBook_author() {
		return book_author;
	}
	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}
	
	
	
	
}
