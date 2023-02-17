package com.tvscredit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mybook")
public class Book {

	@Id
	@Column(name = "book_isbn", nullable = false)
	private int isbn;
	
	@Column(name = "book_name", nullable = false,length = 20)
	private String bname;

	@Column(name = "book_cost", nullable = false)
	private float cost;

	@Column(name = "book_author", nullable = false,length = 20)
	private String author;
	
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
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
}
