package org.com.capgemini.pl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.com.capegemini.model.Author;
import org.com.capegemini.model.Book;

public class EmpMain2 {

	public static void main(String[] args) {

		EntityManagerFactory ef = Persistence.createEntityManagerFactory("jpa2");
		EntityManager em = ef.createEntityManager();
		EntityTransaction tr = em.getTransaction();

		Book book = new Book();
		book.setIsbn(1117);
		book.setPrice(800);
		book.setTitle("ruby complete reference");

		Author author = new Author();
		author.setId(1480);
		author.setName("kiran kumar");

		book.setAuthor(author);

		tr.begin();
		em.persist(book);
		em.persist(author);

		tr.commit();

		ef.close();
	}
}
