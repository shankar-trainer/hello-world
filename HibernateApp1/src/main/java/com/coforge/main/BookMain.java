package com.coforge.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.coforge.model.Book;

public class BookMain {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		SessionFactory sf = configuration.buildSessionFactory();

		Session session = sf.openSession();

		Transaction transaction = session.getTransaction();

		Book book = new Book();
		book.setIsbn(10004);
		book.setBname("king  and queeen story");
		book.setCost(345.56f);

		transaction.begin();
//		session.save(book);
		session.persist(book);
		transaction.commit();
		System.out.println("Record added ");
		// hql -- hibernate query language , not table but pojo file name
		Query createQuery = session.createQuery("from Book");
		List<Book> list = createQuery.list();

		list.forEach(System.out::println);

		System.out.println("\n");
		list.forEach(a -> System.out.println(a.getIsbn() + "\t" + a.getBname() + "\t" + a.getCost()));

		Book find = session.find(Book.class, 10002);
		if(find==null)
			System.out.println("book not found with id 10002");
		else 
			System.out.println("book found with id 10002 \n"+find);
		session.close();
	}
}
