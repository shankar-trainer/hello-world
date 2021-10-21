package com.example.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.model.Book;

@Repository
@Transactional
public class BookDao {

	@PersistenceContext
	EntityManager entityManager;

	public boolean addBook(Book b) {
		if (searchBook(b) == null) {
			entityManager.persist(b);
			return true;
		}
		return false;
	}

	public Book searchBook(Book book) {
		return entityManager.find(Book.class, book.getIsbn());
	}

	public List<Book> getAllBook() {
		return entityManager.createQuery("from Book").getResultList();
	}

}
