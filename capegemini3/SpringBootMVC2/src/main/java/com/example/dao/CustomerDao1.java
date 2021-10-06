package com.example.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.Customer;

@Repository
@Transactional
public class CustomerDao1 {

	@PersistenceContext
	EntityManager em;

	@Transactional
	public boolean addCustomer(Customer customer) {
		if (searchCustomer(customer) == null) {
			em.persist(customer);
			return true;
		}
		return false;
	}
	@Transactional
	public Customer searchCustomer(Customer customer) {
		return em.find(Customer.class, customer.getId());
	}

	public List<Customer> showAllCustomer() {
		return em.createQuery("from Customer").getResultList();
	}

}
