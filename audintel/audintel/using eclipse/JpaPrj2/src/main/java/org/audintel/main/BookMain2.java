package org.audintel.main;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.audintel.model.Book;

public class BookMain2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test1");
		EntityManager em = entityManagerFactory.createEntityManager();

		EntityTransaction transaction = em.getTransaction();

		System.out.println("all books are ");

		TypedQuery<Book> createQuery = em.createNamedQuery("getAllBook", Book.class);

		List<Book> resultList = createQuery.getResultList();
		for (Book b : resultList) {
			System.out.println(b.getIsbn() + "\t" + b.getName() + "\t" + b.getCost());
		}

		System.out.println("Enter book name to search");
		TypedQuery<Book> createQuery1 = em.createNamedQuery("searchByName", Book.class);

		createQuery1.setParameter("name1", sc.nextLine());

		resultList = createQuery1.getResultList();
		if (resultList.size() == 0)
			System.out.println("book not found ");
		else
			for (Book b : resultList) {
				System.out.println(b.getIsbn() + "\t" + b.getName() + "\t" + b.getCost());
			}
		// delete b from Book b where b.isbn=:?1 by position parameter

		System.out.println("Enter book isbn to delete");
		Query createQuery2 = em.createNamedQuery("deleteByIsbn");

		createQuery2.setParameter(1, sc.nextInt());
//		createQuery2.setParameter("isbn1", sc.nextInt());
		transaction.begin();
		int r = createQuery2.executeUpdate();
		transaction.commit();
		if (r == 1)
			System.out.println("book deleted");
		else
			System.out.println("book isbn not  found ");

		for (Book b : resultList) {
			System.out.println(b.getIsbn() + "\t" + b.getName() + "\t" + b.getCost());
		}

		em.close();
		entityManagerFactory.close();
	}
}
