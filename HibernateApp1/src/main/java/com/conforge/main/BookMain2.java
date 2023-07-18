package com.conforge.main;

import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import com.conforge.model.Book;
import com.conforge.util.SessionFactoryUtil;

public class BookMain2 {

	public static void main(String[] args) {
//		Session openSession = new Configuration().configure().buildSessionFactory().openSession();
		Session openSession = SessionFactoryUtil.getSessionFactory().openSession();
		// Query namedquery = openSession.createNamedQuery("getall");
		TypedQuery<Book> namedquery = openSession.createNamedQuery("getall");

		namedquery.getResultList().forEach(System.out::println);

		TypedQuery<Book> isbnquery = openSession.createNamedQuery("findbyisbn");

		isbnquery.setParameter(1, 11);
		try {
			Book singleResult = isbnquery.getSingleResult();
			if (singleResult != null)
				System.out.println("found " + singleResult);
			else
				System.out.println("not found ");
		} catch (NoResultException e) {
			System.err.println(e.getMessage());
		}
		
		//native query 
		
		System.out.println("native query");
		NativeQuery<Book> nativeQuery = openSession.createNativeQuery("select * from book",Book.class);
		nativeQuery.list().forEach(System.out::println);

	}
}
