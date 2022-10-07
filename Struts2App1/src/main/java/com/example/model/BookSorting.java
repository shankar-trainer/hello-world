package com.example.model;

import java.util.Comparator;

public class BookSorting  implements Comparator{

	public int compare(Book book1, Book book2) {
		return book1.getBname().compareTo(book2.getBname());
	}
	
	@Override
	public int compare(Object book1, Object book2) {
		return 0;
	}

}
