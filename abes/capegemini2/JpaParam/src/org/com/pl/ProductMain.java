package org.com.pl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.com.model.Product;

public class ProductMain {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("prdjpa");
		EntityManager manager = factory.createEntityManager();

		EntityTransaction transaction = manager.getTransaction();

		Product prd1 = new Product();
		prd1.setPrd_name("java expert book");
		prd1.setPrd_cost(1200);

		/*
		 * transaction.begin(); manager.persist(prd1); transaction.commit();
		 */

		Query createQuery = manager.createQuery("select p from Product p");

		List<Product> resultList = createQuery.getResultList();

		for (Product product : resultList) {
			System.out.println(product);
		}

		System.out.println("\nNamed Parameter \n Record with cost between 400- 1200\n");

		TypedQuery<Product> createQuery1 = manager
				.createQuery("select p from Product p where p.prd_cost between :cost1 and :cost2", Product.class);

		createQuery1.setParameter("cost1", 400.0f);
		createQuery1.setParameter("cost2", 1200.0f);

		resultList = createQuery1.getResultList();

		for (Product product : resultList) {
			System.out.println(product);
		}

		System.out.println("\nOrdinal Parameter \n Record with cost >=500\n");
		TypedQuery<Product> createQuery2 = manager.createQuery("select p from Product p where p.prd_cost>=?1",
				Product.class);

		createQuery2.setParameter(1, 500.0f);

		resultList = createQuery2.getResultList();

		for (Product product : resultList) {
			System.out.println(product);
		}
		
		System.out.println("muliple lines combined in single line");
		resultList = manager.createQuery("select p from Product p where p.prd_cost>=?1", Product.class)
				.setParameter(1, 500.0f).getResultList();

		for (Product product : resultList) {
			System.out.println(product);
		}

		System.out.println("using java8 lambda and stream");

		manager.createQuery("select p from Product p where p.prd_cost>=?1", Product.class).setParameter(1, 500.0f)
				.getResultList().stream().forEach(a -> System.out.println(a));

		factory.close();
	}
}
