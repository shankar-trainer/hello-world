package org.com;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

public class ProductMain {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JpaPrj",System.getProperties());
		EntityManager entityManager = factory.createEntityManager();

		EntityTransaction tr = entityManager.getTransaction();
		tr.begin();

		Product product = new Product();
		product.setId(1115);
		product.setName("java book");
		product.setCost(565.67f);

		entityManager.persist(product);

		tr.commit();

	List<Product> list=	entityManager.createQuery("select p from Product p").getResultList();
		
		for (Product product2 : list) {
			System.out.println(product2.getId()+"  "+product2.getName()+"  "+product2.getCost());
		}
		
	}
}
