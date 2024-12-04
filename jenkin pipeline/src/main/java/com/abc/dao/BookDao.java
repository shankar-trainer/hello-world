package com.abc.dao;

import java.util.ArrayList;
import java.util.List;

import com.abc.model.Book;

public class BookDao {

	List<Book> blist;
	
	public BookDao() {
		blist=new ArrayList<>();
	}

	public List<Book> getAllBook() {
		return blist;
	}

	public void addBook(Book b1) {
		blist.add(b1);
	}

	public boolean searchBook(Book b) {
		return blist.contains(b);
	}
}
