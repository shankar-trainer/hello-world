package com.coforge.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.coforge.model.Book;

public class BookDao {

	SessionFactory factory;

	public BookDao(SessionFactory factory) {
		this.factory = factory;
	}

	public List<Book> getAllBook() {
		Session session = factory.openSession();
		return session.createQuery("from Book").list();
	}

	public Book addBook(Book book) {
		Session session = factory.openSession();
		Transaction transaction = session.getTransaction();
		if (searchBook(book.getIsbn()) == null) {
			transaction.begin();
			session.save(book);
			transaction.commit();
			return book;
		}
		return null;
	}

	public Book searchBook(int isbn) {
		Session session = factory.openSession();
		return session.find(Book.class, isbn);
	}

}
