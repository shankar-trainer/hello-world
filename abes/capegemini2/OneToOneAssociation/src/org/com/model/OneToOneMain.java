package org.com.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class OneToOneMain {

	public static void main(String[] args) {
		EntityManagerFactory ef = Persistence.createEntityManagerFactory("prdonetoone");
		EntityManager em = ef.createEntityManager();
		EntityTransaction tr = em.getTransaction();

		Book book = new Book("two states", 450.55f);
		Author author = new Author("cheta bhagat", 45, book);
 
		tr.begin();
		em.persist(author);
		em.persist(book);
		tr.commit();
 
		//em.createQuery("from Author");
		
		em.createQuery("from Author").getResultList().stream().forEach(System.out::println);
		ef.close();
	}
}
