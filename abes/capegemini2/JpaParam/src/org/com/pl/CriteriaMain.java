package org.com.pl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.com.model.Product;

public class CriteriaMain {

	public static void main(String[] args) {

		EntityManagerFactory ef = Persistence.createEntityManagerFactory("prdjpa");
		EntityManager em = ef.createEntityManager();

		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<Product> criteriaQuery = builder.createQuery(Product.class);

		Root<Product> prd = criteriaQuery.from(Product.class);

		CriteriaQuery<Product> select = criteriaQuery.select(prd);

		/*
		 * for (Product p : em.createQuery(select).getResultList())
		 * System.out.println(p);
		 */
		
		
		em.createQuery(select).getResultList().forEach(System.out::println);
		
		CriteriaQuery<Product> where = criteriaQuery.select(prd).
				where(builder.equal(prd.get("prd_name"), "java beginner book"));
		
		System.out.println("\nusing where prd name== java beginner book \n");
		em.createQuery(where).getResultList().forEach(System.out::println);
		
		where = criteriaQuery.select(prd).
				where(builder.between(prd.get("prd_cost"),300,700 ));
		
		System.out.println("\nusing where prd cost between 300 - 700 \n");
		em.createQuery(where).getResultList().forEach(System.out::println);
		
		where = criteriaQuery.select(prd).
				where(builder.like(prd.get("prd_name"),"j%" ));
		
		System.out.println("\nusing where prd name starts with j are \n");
		em.createQuery(where).getResultList().forEach(System.out::println);
		}
}
