package org.capg.service;

import java.util.List;

import org.capg.model.Book;

public interface BookService {
	public List<Book> showAllBook();
	public boolean saveBook(Book book);
}
