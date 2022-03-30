package com.capg.bean.bidir.one_to_one;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Book {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int isbn;
	private String bname;
	private float cost;
	@OneToOne(cascade = CascadeType.ALL)
	private Author author;
	
	@OneToMany(cascade = CascadeType.PERSIST)
	private Set<BookOrder> bookOrder;
	
	public Set<BookOrder> getBookOrder() {
		return bookOrder;
	}
	public void setBookOrder(Set<BookOrder> bookOrder) {
		this.bookOrder = bookOrder;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
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
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	
	
	
}
