package org.com.service;

import org.com.dao.CustomerDao;
import org.com.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

	@Autowired
	CustomerDao dao;
	
	public void storeCustomer(Customer customer) {
		if(dao.addCustomer(customer))
			System.out.println("Customer added");
		else
			System.out.println("Customer already present");
	}
	
	public void findCustomer(Customer customer) {
		if(dao.searchCustomer(customer)!=null)
			System.out.println("Customer found: \n"+customer);
		else
			System.out.println("Customer not found \n");
	}
	
	public void deleteCustomer(Customer customer) {
		if(dao.removeCustomer(customer))
			System.out.println("Customer is removed: \n"+customer);
		else
			System.out.println("Customer not found \n");
	}
	
	public void viewCustomer() {
		dao.showCustomer().stream().forEach(System.out::println);;
	}
}
