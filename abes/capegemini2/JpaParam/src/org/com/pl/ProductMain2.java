package org.com.pl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.com.model.Product;

public class ProductMain2 {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("prdjpa");
		EntityManager manager = factory.createEntityManager();

		EntityTransaction transaction = manager.getTransaction();

		TypedQuery<Product> createNamedQuery = manager.createNamedQuery("showAllProduct", Product.class);

		createNamedQuery.getResultList().forEach(System.out::println);

		TypedQuery<Product> createNamedQuery1 = manager.createNamedQuery("showAllProduct1", Product.class);

		createNamedQuery1.setParameter(1, 500.0f);
		System.out.println("named query with parameter");
		createNamedQuery1.getResultList().forEach(System.out::println);

		factory.close();
	}
}
