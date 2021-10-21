package org.com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.com.model.Customer;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;;

@Transactional
@Repository
public class CustomerDao {
	
	@PersistenceContext
	EntityManager em;

	public boolean addCustomer(Customer customer) {
		if (searchCustomer(customer) == null) {
			em.persist(customer);
			return true;
		}
		return false;
	}

	public Customer searchCustomer(Customer customer) {
		return em.find(Customer.class, customer.getId());
	}

	public boolean removeCustomer(Customer customer) {
		if (em.contains(customer)) {
			em.remove(customer);
			return true;
		}
		return false;
	}

	public List<Customer> ShowAllCustomer() {
		Query qr = em.createQuery("from Customer");
		return qr.getResultList();
	}

}
