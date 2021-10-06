package org.com.service;

import java.util.List;

import org.com.dao.CustomerDao;
import org.com.dao.CustomerDaoImpl;
import org.com.dto.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDao dao;

	@Override
	public Customer saveCustomer(Customer customer) {
		dao.addCustomer(customer);
		return customer;
	}

	@Override
	public Customer deleteCustomer(int id) {
		return dao.removeCustomer(id);

	}

	@Override
	public Customer changeCustomer(Customer customer) {
		return dao.updateCustomer(customer);

	}

	@Override
	public Customer findCustomer(int id) {
		return dao.searchCustomer(id);
	}

	@Override
	public List<Customer> getAllCustomer() {
		return dao.showAllCustomer();
	}

}
