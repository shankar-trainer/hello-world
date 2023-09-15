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
		book.setIsbn(10002);
		book.setBname("tiger and rabbit story");
		book.setCost(120);

		transaction.begin();
		session.save(book);
		transaction.commit();
		System.out.println("Record added ");
		// hql -- hibernate query language , not table but pojo file name
		Query createQuery = session.createQuery("from Book");
		List<Book> list = createQuery.list();

		list.forEach(System.out::println);

		System.out.println("\n");
		list.forEach(a -> System.out.println(a.getIsbn() + "\t" + a.getBname() + "\t" + a.getCost()));

		session.close();
	}
}
