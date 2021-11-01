package org.com.app2.dao;

import java.util.HashMap;
import org.springframework.stereotype.Repository;
import org.com.app2.model.Book;

@Repository
//("dao")
public class BookDaoImpl implements BookDao {

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
