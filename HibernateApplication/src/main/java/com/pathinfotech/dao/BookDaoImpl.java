package com.pathinfotech.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.pathinfotech.model.Book;
import com.pathinfotech.util.MySessionFactory;

public class BookDaoImpl implements BookDao {
	SessionFactory sessionFactory;
	Session session;
	Transaction tr;

	public BookDaoImpl() {
		sessionFactory = MySessionFactory.getMySessionfactory();
		session = sessionFactory.openSession();
		tr = session.getTransaction();
	}

	@Override
	public boolean addBook(Book b) {
		if (searchBook(b.getIsbn()) == null) {
			tr.begin();
			session.save(b);
			tr.commit();
			return true;
		}
		return false;
	}

	@Override
	public Book searchBook(long isbn) {
		Book find = session.find(Book.class, isbn);
		return find;
	}

	@Override
	public boolean removeBook(long isbn) {
		if (searchBook(isbn) != null) {
			tr.begin();
			session.delete(searchBook(isbn));
			tr.commit();
			return true;
		}
		return false;
	}

	@Override
	public boolean updateBook(Book b) {
		if (searchBook(b.getIsbn()) != null) {
			tr.begin();
			session.update(b);
			tr.commit();
			return true;
		}
		return false;
	}

	@Override
	public List<Book> showAllBook() {
		return  session.createQuery("from Book").getResultList();
	}

}
