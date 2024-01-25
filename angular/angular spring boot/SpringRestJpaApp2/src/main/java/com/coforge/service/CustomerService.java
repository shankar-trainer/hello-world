package com.coforge.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.dao.CustomerDao;
import com.coforge.exception.CustomerException;
import com.coforge.model.Customer;

@Service
public class CustomerService {

	@Autowired
	CustomerDao dao;

	public Customer addCustomer(Customer c) {
		Optional<Customer> findById = dao.findById(c.getCustomerId());
		if (findById.isPresent())
			throw new CustomerException("customer already present");
		else
			return dao.save(c);
	}

	public Customer updateCustomer(Customer c) {
		Optional<Customer> findById = dao.findById(c.getCustomerId());
		if (!findById.isPresent())
			throw new CustomerException("customer not present");
		else
			return dao.save(c);
	}

	public Customer removeCustomer(long id) {
		Optional<Customer> findById = dao.findById(id);
		if (findById.isPresent()) {
			Customer customer = findById.get();
			dao.delete(customer);
			return customer;
		} else
			throw new CustomerException("customer not present");

	}

	public Customer searchCustomer(long id) {
		Optional<Customer> findById = dao.findById(id);
		if (findById.isPresent())
			return findById.get();
		else
			throw new CustomerException("customer not present");
	}

	public List<Customer> getAllCustomer() {
		if (dao.findAll().size() == 0)
			throw new CustomerException("customer list is empty");
		else
			return dao.findAll();
	}

}
