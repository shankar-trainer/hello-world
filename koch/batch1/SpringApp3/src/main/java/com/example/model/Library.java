package com.example.model;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.annotation.Resources;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Library {
	
	private int libraryId;
	
	private String libraryName;
	private String location;
	
	@PostConstruct
	public void init() {
		this.libraryId=899898;
		this.libraryName="gandhi library";
	}
	
	
	@Override
	public String toString() {
		return "Library [libraryId=" + libraryId + ", libraryName=" + libraryName + ", location=" + location + ", book="
				+ book + "]";
	}
	//@Autowired(required = true)
//	@Qualifier("book2")
	
	//@Resource(name="book2")
	@Inject
	@Qualifier("book1")
	private Book book; 
	
	public int getLibraryId() {
		return libraryId;
	}
	public void setLibraryId(int libraryId) {
		this.libraryId = libraryId;
	}
	public String getLibraryName() {
		return libraryName;
	}
	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	

}
