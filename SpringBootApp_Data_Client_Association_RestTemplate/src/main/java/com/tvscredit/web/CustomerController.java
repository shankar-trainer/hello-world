package com.tvscredit.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tvscredit.dao.AddressDao;
import com.tvscredit.dao.CustomerDao;
import com.tvscredit.dao.ProductDao;
import com.tvscredit.model.Customer;
import com.tvscredit.model.Product;

@RestController
public class CustomerController {

	@Autowired
	CustomerDao customerDao;
	
	@Autowired
	ProductDao productDao;

	@Autowired
	AddressDao addressDao;

	@PostMapping("/addCustomer")
	public Customer addCustomer(@RequestBody Customer customer) {
		addressDao.save(customer.getAddress());
		
		for(Product p:customer.getProductSet())
		productDao.save(p);
		
		
		customerDao.save(customer);
		return customer;
	}

	@GetMapping("/getAllCustomer")
	public List<Customer> allCustomer() {
		return customerDao.findAll();
	}

}
