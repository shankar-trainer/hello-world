package org.audintel.main;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.audintel.model.Book;

public class BookMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test1");
		EntityManager em = entityManagerFactory.createEntityManager();

		EntityTransaction transaction = em.getTransaction();

		Book book = new Book();

		/*
		 * System.out.println("Enter book name and cost"); book.setName(sc.nextLine());
		 * book.setCost(sc.nextFloat());
		 * 
		 * transaction.begin(); em.persist(book); transaction.commit();
		 * System.out.println("book added ");
		 */
		System.out.println("all books are ");

		/*
		 * Query createQuery = em.createQuery("Select b from Book b");
		 * 
		 * List resultList = createQuery.getResultList(); for (Object object :
		 * resultList) { Book b = (Book) object; System.out.println(b.getIsbn() + "\t" +
		 * b.getName() + "\t" + b.getCost()); }
		 */
		TypedQuery<Book> createQuery = em.createQuery("Select b from Book b", Book.class);

		List<Book> resultList = createQuery.getResultList();
		for (Book b : resultList) {
			System.out.println(b.getIsbn() + "\t" + b.getName() + "\t" + b.getCost());
		}

		// static value isbn=1
		// TypedQuery<Book> createQuery1 = em.createQuery("Select b from Book b where
		// b.isbn=1",Book.class);

		System.out.println("Enter isbn to search ");
		// named parameter
		TypedQuery<Book> createQuery1 = em.createQuery("Select b from Book b where b.isbn=:isbn1", Book.class);
		createQuery1.setParameter("isbn1", sc.nextInt());

		try {
			Book b = createQuery1.getSingleResult();
			System.out.println("book found");
			System.out.println(b.getIsbn() + "\t" + b.getName() + "\t" + b.getCost());
		} catch (NoResultException e) {
			System.out.println("book isbn not present");
		}
		em.close();
		entityManagerFactory.close();
	}
}
