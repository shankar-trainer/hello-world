package org.capg.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Library {
	private int libraryId;
	private String libraryName;
	private String libraryLocation;
	private int libraryCapacity;
	
	@Autowired
	@Qualifier(value = "book1")
	private Book book;

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

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

	public String getLibraryLocation() {
		return libraryLocation;
	}

	public void setLibraryLocation(String libraryLocation) {
		this.libraryLocation = libraryLocation;
	}

	public int getLibraryCapacity() {
		return libraryCapacity;
	}

	public void setLibraryCapacity(int libraryCapacity) {
		this.libraryCapacity = libraryCapacity;
	}

	@Override
	public String toString() {
		return "Library \n\n\t[libraryId=" + libraryId + ", libraryName=" + libraryName + ", libraryLocation="
				+ libraryLocation + ", libraryCapacity=" + libraryCapacity + "]";
	}
 
}
