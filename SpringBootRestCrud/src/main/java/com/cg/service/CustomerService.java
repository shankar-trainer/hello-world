package com.cg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.CustomerRepository;
import com.cg.error.CustomerException;
import com.cg.model.Customer;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository repository;

	public Customer addCustomer(Customer customer) throws CustomerException {
		Optional<Customer> findById = repository.findById(customer.getCustomerId());
		if (!findById.isPresent()) {
			return repository.save(customer);
		} else
			throw new CustomerException("Customer already present");
	}

	public Customer deleteCustomer(Customer customer) throws CustomerException {
		Optional<Customer> findById = repository.findById(customer.getCustomerId());
		if (findById.isPresent()) {
			Customer c = findById.get();
			repository.delete(customer);
			return c;
		} else
			throw new CustomerException("Customer not found");

	}

	public Customer searchCustomer(Customer customer) throws CustomerException {
		Optional<Customer> findById = repository.findById(customer.getCustomerId());
		if (findById.isPresent()) {
			return findById.get();
		} else
			throw new CustomerException("Customer not found");
	}

	public List<Customer> getAllCustomer() throws CustomerException {
		if (repository.findAll().size() == 0)
			throw new CustomerException("Customer List is blank");
		else {
			System.out.println("service getall called ");
			return repository.findAll();
		}
	}

}
