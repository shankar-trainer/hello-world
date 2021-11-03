package org.capg.model;

import org.springframework.stereotype.Component;

@Component
public class Book {

	private int isbn;
	private String  bname;
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


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book \n\tisbn=" + isbn + "\n\tbname=" + bname + "\n\tauthor=" + author ;
	}
}
