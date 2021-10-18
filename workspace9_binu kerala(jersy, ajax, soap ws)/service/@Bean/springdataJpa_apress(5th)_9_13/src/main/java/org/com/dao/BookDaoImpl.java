package org.com.dao;


import java.util.HashMap;

import org.com.model.Book;
import org.springframework.stereotype.Repository;

@Repository
//("dao")
public class BookDaoImpl {

	HashMap<Integer, Book> hashMap;

	public BookDaoImpl() {
		hashMap = new HashMap<Integer, Book>();
	}

	public boolean addBook(Book book) {
		if (hashMap.containsKey(book.getIsbn()))
			return false;
		else {
			hashMap.put(book.getIsbn(), book);
			return true;
		}
	}

	public HashMap<Integer, Book> getAllBook() {
		return hashMap;
	}
}
