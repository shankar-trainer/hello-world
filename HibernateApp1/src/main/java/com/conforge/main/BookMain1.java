package com.conforge.main;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.conforge.model.Book;

public class BookMain1 {

	public static void main(String[] args) {
		Session openSession = new Configuration().configure().buildSessionFactory().openSession();
		openSession.createQuery("from Book").list().forEach(a -> System.out.println(a));

		System.out.println("scope operator ..");
		openSession.createQuery("from Book").list().forEach(System.out::println);

		System.out.println("using find method");
		System.out.println(openSession.find(Book.class, 10));

		System.out.println("using load method");
		System.out.println(openSession.load(Book.class, 1));
		// System.out.println(openSession.load(Book.class, 11));// load may throw
		// exception of not found

		// position based parameter

		System.out.println("position based parameter");
//		Query qr = openSession.createQuery("from Book  b where b.isbn=?1");
		// Query<Book> qr = openSession.createQuery("from Book b where b.isbn=?1");
		TypedQuery<Book> qr = openSession.createQuery("from Book  b where b.isbn=?1");

//		qr.setInteger(1, 1);
		qr.setParameter(1, 1);
//		Book b = (Book) qr.uniqueResult();
		Book b = qr.getSingleResult(); // typed query has getSingleResult
		System.out.println(b);

		// named based parameter

		System.out.println("named based parameter");
//		Query qr1 = openSession.createQuery("from Book  b where b.isbn=:isbn1");
		TypedQuery<Book> qr1 = openSession.createQuery("from Book  b where b.isbn=:isbn1");

		// qr1.setInteger("isbn1", 2);
		qr1.setParameter("isbn1", 2);
//		Book b1 = (Book) qr1.uniqueResult();
		Book b1 = (Book) qr1.getSingleResult();
		System.out.println(b1);

	}
}
