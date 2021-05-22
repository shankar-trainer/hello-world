package com.cts.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cts.model.Book;

@Repository
@Transactional
public class BookDao {

	@PersistenceContext
	EntityManager em;

	Book b1;

	public boolean addBook(Book b) {
		if (searchBook(b) == null) {
			em.persist(b);
			return true;
		}
		else 
			return false;
	}

	public Book searchBook(Book b) {
		b1 = null;
		b1 = em.find(Book.class, b.getISBN());
		return b1;
	}
	
	public List<Book> getAllBook() {
	  return em.createQuery("from Book").getResultList();
	}

}
