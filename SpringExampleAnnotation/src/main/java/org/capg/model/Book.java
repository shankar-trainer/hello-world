package org.capg.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Book {

	private  int bookIsbn;
	private  String bookName;
	private  float bookCost;
	
	@PreDestroy                   
	public void bookDestroy() {
		System.out.println("cleanup called");
	}
	/*
	@PostConstruct
	public void bookInit() {
		System.out.println("init called");
		bookIsbn=67767676;
		bookName="spring pro";
		bookCost=1200.00f;
	}*/
	
	public int getBookIsbn() {
		return bookIsbn;
	}
	public void setBookIsbn(int bookIsbn) {
		this.bookIsbn = bookIsbn;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public float getBookCost() {
		return bookCost;
	}
	public void setBookCost(float bookCost) {
		this.bookCost = bookCost;
	}
	
	
}
