
//package org.com.model;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.com.model.Order;
import org.com.model.Product;

public class MainyToManyMain {

	public static void main(String[] args) {
		EntityManagerFactory ef = Persistence.createEntityManagerFactory("prdonetoone");
		EntityManager em = ef.createEntityManager();
		EntityTransaction tr = em.getTransaction();

		String pname[] = { "Book", "Pen", "TV", "Mobile", "laptop", "Rice" };

		Product product[] = new Product[2];

		int k = 0;
		Set<Product> prdset;

		Order order[] = new Order[3];
		for (int i = 0; i < order.length; i++) {
			order[i] = new Order();
			order[i].setOrder_date(new Date());
			prdset = null;
			prdset = new HashSet<>();

			for (int j = 0; j < product.length; j++) {
				product[j] = new Product();
				product[j].setPrd_name(pname[k++]);
				prdset.add(product[j]);
			}
			order[i].setProduct_set(prdset);
		}
		tr.begin();
	    for (int i = 0; i < order.length; i++) {
			em.persist(order[i]);
			
			Set<Product> pset=order[i].getProduct_set();
			
			for (Product prd:pset) {
				em.persist(prd);
			}
		}
	    
	    List<Order> resultList = em.createQuery("from Order").getResultList();
	    
	    for (Order order2 : resultList) {
			System.out.println("Order Detail");
			System.out.println("Order id "+order2.getOrder_id());
			System.out.println("Order date "+order2.getOrder_date());
			
			Set<Product> pset1=order2.getProduct_set();
			
			System.out.println("\n\tProduct Detail");
			for (Product p1 : pset1) {
				System.out.println("\tproduct id "+p1.getId());
				System.out.println("\tproduct name "+p1.getPrd_name());
			}
		}
		tr.commit();
		ef.close();
	}
}
