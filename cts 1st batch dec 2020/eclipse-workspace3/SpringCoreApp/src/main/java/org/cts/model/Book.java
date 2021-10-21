package org.cts.model;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("b1")
@Scope("prototype")
public class Book {

	private int ISBN;
	private String bookName;
	private float bookCost;

	@PostConstruct
	void init() {
		ISBN = 7777;
		bookName = "react book";
		bookCost = 567;
	}
	

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
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
