package com.conforge.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.conforge.model.Book;

public class BookDao {

	SessionFactory factory;
	Session session;
	Transaction transaction;

	List<Book> bookList;

	public BookDao() {
		factory = new Configuration().configure().buildSessionFactory();
		session = factory.openSession();
		transaction = session.getTransaction();
	}

	public boolean addBook(Book book) {
		if (searchBook(book.getIsbn()) == null) {
			transaction.begin();
			session.save(book);
			transaction.commit();
			return true;
		}
		return false;
	}

	public boolean updateBook(Book book) {
		if (searchBook(book.getIsbn()) != null) {
			transaction.begin();
			session.update(book);
			transaction.commit();
			return true;
		}
		return false;
	}

	public boolean removeBook(int isbn) {
		Book b1 = searchBook(isbn);

		if (b1 != null) {
			transaction.begin();
			session.delete(bookList);
			transaction.commit();
			return true;
		}
		return false;
	}

	public List<Book> getAllBook() {
		bookList = session.createQuery("from Book").list();
		return bookList;
	}

	public Book searchBook(int isbn) {
		Book find = session.find(Book.class, isbn);
		return find;
	}

	public void close() {
		session.close();
	}
}
