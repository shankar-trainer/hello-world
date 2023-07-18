package com.conforge.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
//@NamedQuery(name = "getall",query = "from Book")
//@NamedQuery(name = "findbyisbn",query = "from Book  b where b.isbn=?1")

@NamedQueries(value = { @NamedQuery(name = "getall", query = "from Book"),
		@NamedQuery(name = "findbyisbn", query = "from Book  b where b.isbn=?1") })
public class Book {
	@Id
	@GeneratedValue
	private int isbn;
	private String bname;
	private float cost;
	private LocalDate publishedDate;

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

	public LocalDate getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(LocalDate publishedDate) {
		this.publishedDate = publishedDate;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", bname=" + bname + ", cost=" + cost + ", publishedDate=" + publishedDate + "]";
	}

}
