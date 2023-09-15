package com.coforge.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.coforge.model.Book;

public class BookMain {

	public static void main(String[] args) {
		Configuration configuration=new Configuration().configure();
		SessionFactory sf = configuration.buildSessionFactory();
		
		Session session = sf.openSession();
		
		 Transaction transaction = session.getTransaction();
		
		 Book book=new Book();
		 book.setIsbn(10001);
		 book.setBname("monkey story");
		 book.setCost(100);
		 
		 transaction.begin();
		 session.save(book);
		 transaction.commit();
		 System.out.println("Record added ");
		session.close();
	}
}
