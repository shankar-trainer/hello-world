package com.cognizant.model;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Library {

	private int libId;
	private String libname;
	private String libLocation;
	@Autowired
	@Qualifier(value = "book1")
	private Book book;

	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	@PostConstruct 
	public void libInit() {
		libId=909090;
		libname="muthu library";
		libLocation="chennai";
	} 
	public int getLibId() {
		return libId;
	}

	public void setLibId(int libId) {
		this.libId = libId;
	}

	public String getLibname() {
		return libname;
	}

	public void setLibname(String libname) {
		this.libname = libname;
	}

	public String getLibLocation() {
		return libLocation;
	}

	public void setLibLocation(String libLocation) {
		this.libLocation = libLocation;
	}

}
