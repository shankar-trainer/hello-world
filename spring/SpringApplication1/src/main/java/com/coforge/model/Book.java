package com.coforge.model;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component(value = "book")
@Lazy(value = false)
//@Scope(value = "singleton")
@Scope(value = "prototype")
public class Book {

	private long isbn;
	private String bname;
	private String author;;
	
	@PostConstruct
	public void bookInit() {
		System.out.println("book init called");
		this.isbn=7667677676l;
		this.bname="spring in action";
		this.author="craig wall ";
	}

	
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", bname=" + bname + ", author=" + author + "]";
	}


	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(long isbn) {
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
	
	
}
