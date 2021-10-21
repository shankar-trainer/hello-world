package cts.com.dao;

import java.util.List;

import javax.persistence.EntityManager;

import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;
import cts.com.model.Customer;

@Repository
@Transactional
public class CustomerDao {

	@PersistenceContext
	EntityManager em;

	public boolean addCustomr(Customer customer) {
		if (searchCustomr(customer) == null) {
			em.persist(customer);
			return true;
		}
		return false;
	}

	public Customer searchCustomr(Customer customer) {
		return em.find(Customer.class, customer.getId());
	}

	public List<Customer> getAllCustomr() {
		return em.createQuery("from Customer").getResultList();
	}

}
