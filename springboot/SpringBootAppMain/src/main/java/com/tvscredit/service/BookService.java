package com.tvscredit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tvscredit.dao.BookRepository;
import com.tvscredit.error.BookException;
import com.tvscredit.model.Book;

@Service
public class BookService {

	@Autowired
	BookRepository repository;

	// RETRIEVE CRUD
	public List<Book> getAllBook() throws BookException {
		if (repository.findAll().size() == 0)
			throw new BookException("Book List is empty");
		return repository.findAll();
	}

	// RETRIEVE CRUD
	public Book searchBook(int isbn) throws BookException {
		Optional<Book> findById = repository.findById(isbn);
		if (findById.isPresent())
			return findById.get();
		else
			throw new BookException("Book not present with isbn " + isbn);
	}
	
	public Book searchBook1(int isbn)  {
		Optional<Book> findById = repository.findById(isbn);
		if (findById.isPresent())
			return findById.get();
		else
			 return null;
	}

	// CReate CRUD
	public Book addBook(Book b) {
		if (searchBook1(b.getIsbn()) == null) {
			return repository.save(b);
		}
		return null;
	}

	// DELETE CRUD
	public Book deleteBook(int id) throws BookException {
		Book book1 = searchBook1(id);
		if (book1 == null) {
			throw new BookException("Book not present with isbn " + id);
		 
		} else {
			repository.deleteById(id);
			return book1;
		}
	}

	// Update --CRUD
	public Book updateBook(Book b) throws BookException {
		if (searchBook1(b.getIsbn()) == null) {
			throw new BookException("Book not  present with isbn " +b.getIsbn() );
		} else {
			return repository.save(b);
		}
	}

}
