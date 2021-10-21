package org.com.capgemini.pl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.com.capegemini.model.Author;
import org.com.capegemini.model.Book;

public class EmpMain2 {

	public static void main(String[] args) {

		EntityManagerFactory ef = Persistence.createEntityManagerFactory("jpa2");
		EntityManager em = ef.createEntityManager();
		EntityTransaction tr = em.getTransaction();
		TypedQuery<Book> qr1 = (TypedQuery<Book>) em.createQuery("from Book");

		for (Book b : qr1.getResultList()) {
			System.out.println("\nISBN " + b.getIsbn());
			System.out.println("Title " + b.getTitle());
			System.out.println("\nPrice " + b.getPrice());
		}
		TypedQuery<Book> qr2 = (TypedQuery<Book>) em.createQuery

		("select  b from Book b where b.author.name='kiran kumar' ");

		System.out.println("Result is ... ");
		for (Book b : qr2.getResultList()) {
			System.out.println("\nISBN " + b.getIsbn());
			System.out.println("Title " + b.getTitle());
			System.out.println("\nPrice " + b.getPrice());
		}

		TypedQuery<Book> qr3 = (TypedQuery<Book>) em.createQuery
				("select b from Book b  where b.price between 800 and 5000 ");

		
		System.out.println("Result is ... ");
		for (Book b : qr3.getResultList()) {
			System.out.println("\nISBN " + b.getIsbn());
			System.out.println("Title " + b.getTitle());
			System.out.println("\nPrice " + b.getPrice());
		}
		
		ef.close();
	}
}
