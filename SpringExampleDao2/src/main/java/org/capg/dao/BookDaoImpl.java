package org.capg.dao;

import java.util.ArrayList;
import java.util.List;

import org.capg.model.Book;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {

	List<Book> bookList;

	public BookDaoImpl() {
		bookList = new ArrayList<>();
	}

	@Override
	public List<Book> getAllBook() {
		return bookList;
	}

	@Override
	public boolean addBook(Book book) {
		bookList.add(book);
		return true;
	}

}
