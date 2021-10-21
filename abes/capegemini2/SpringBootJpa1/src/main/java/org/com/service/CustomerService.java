package org.com.service;

import java.util.List;

import org.com.dao.CustomerDao;
import org.com.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

	@Autowired
	CustomerDao dao;

	public void storeCustomer(Customer customer) {
		if (dao.addCustomer(customer))
			System.out.println(" customer added");
		else
			System.out.println(" customer already present");
	}

	public void findCustomer(Customer customer) {
		if (dao.searchCustomer(customer)!=null)
			System.out.println("customer found \n" + customer);
		else
			System.out.println("customer not found \n");
	}
	public void  deleteCustomer(Customer customer) {
		if (dao.removeCustomer(customer))
			System.out.println("customer is removed \n" );
		else
			System.out.println("customer not found \n");
	}
	
	public void getAllCustomer() {
	   dao.ShowAllCustomer().stream().forEach(System.out::println);
	}
	
}
