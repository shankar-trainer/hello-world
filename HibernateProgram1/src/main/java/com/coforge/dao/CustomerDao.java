package com.coforge.dao;

import java.util.List;

import com.coforge.model.Customer;

public interface CustomerDao {
	
   Customer addCustomer(Customer c); 
   Customer searchCustomer(int id);
   List<Customer> getAllCustomer();

   Customer deleteCustomer( int id); 
   Customer updateCustomer(Customer c); 

   
}
