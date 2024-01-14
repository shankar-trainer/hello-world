package org.com.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.com.exception.BookException;
import org.com.model.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import lombok.Data;

@Repository
@Data
public class BookDaoImpl implements BookDao {

	SessionFactory factory;
	Session session;
	
	Book b;

	public BookDaoImpl(SessionFactory factory) {
		this.factory = factory;
		session = factory.openSession();
	 
	}

	@Transactional
	@Override
	public Book addBook(Book b1) {
		b=null;
		b = session.find(Book.class, b1.getIsbn());
		if(b!=null)
			throw new BookException("book already present");
		
		session.save(b1);
		System.out.println("book added");
		return b1;
	}

	@Transactional
	@Override
	public Book removeBook(long isbn) {
		b=null;
		b = session.find(Book.class, isbn);
		if(b==null)
			throw new BookException("book not present");
			
		 
		b = session.find(Book.class, isbn);
		session.remove(isbn);
	 
		System.out.println("book removed "+b);
		return b;
	}

	@Transactional
	@Override
	public Book updateBook(Book b1) {
		b=null;
		b = session.find(Book.class,b1.getIsbn() );
		if(b==null)
			throw new BookException("book not present");
		
	 
		Book b2 = (Book) session.merge(b1);
		 
		System.out.println("book updated "+b2);
		return b2;
	}

	@Override
	public Book searchBook(long isbn) {
		b=null;
		b = session.find(Book.class,isbn );
		if(b==null)
			throw new BookException("book not present");
			
		else 
			System.out.println("book found "+b);
			return b;
	}

	@Override
	public List<Book> getAllBook() {
		List<Book> resultList = session.createQuery("from Book").getResultList();

		if(resultList.size()==0)
			throw new BookException("book list is empty");
		else
			return resultList;
	}

}
