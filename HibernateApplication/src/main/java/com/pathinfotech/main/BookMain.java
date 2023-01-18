package com.pathinfotech.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.pathinfotech.model.Book;

public class BookMain {

	public static void main(String[] args) {
		
		Configuration configuration=new Configuration().configure();
		
		SessionFactory buildSessionFactory = configuration.buildSessionFactory();
		Session session = buildSessionFactory.openSession();
		
	     Transaction tr = session.getTransaction();
	     
	     Book book=new Book();
	     book.setIsbn(787881);
	     book.setBname("java professional");
	     book.setCost(700);
	     book.setAuthor("a kumar");
	     
	     tr.begin();
	     session.save(book);
	     tr.commit();
	     System.out.println("Record added ");
	     
	     Query createQuery = session.createQuery("from Book");
	     List<Book> resultList = createQuery.getResultList();
	     for(Book b:resultList)
	    	 System.out.println(b.getIsbn()+"\t"+b.getBname()+"\t"+b.getAuthor()+"\t"+b.getCost());
	}
}
