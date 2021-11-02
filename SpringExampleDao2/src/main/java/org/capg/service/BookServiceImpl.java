package org.capg.service;

import java.util.List;

import org.capg.dao.BookDaoImpl;
import org.capg.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookDaoImpl dao;

	@Override
	public List<Book> showAllBook() {
		return dao.getAllBook();
	}

	@Override
	public boolean saveBook(Book book) {
		if (dao.addBook(book))
			return true;

		return false;
	}

}
