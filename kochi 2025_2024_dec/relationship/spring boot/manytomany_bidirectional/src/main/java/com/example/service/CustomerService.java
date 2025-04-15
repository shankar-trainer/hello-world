package com.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.model.MenuItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Customer;
import com.example.model.Order;
import com.example.repository.CustomerRepository;
import com.example.repository.OrderRepository;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    
    @Autowired
 private OrderRepository orderRepository;    
 
    public Customer registerCustomer(Customer customer) {
        List<Order> list1=new ArrayList<>();
    	for(Order o:customer.getOrders()) {
            o.setCustomer(customer);
            list1.add(o);

            List<MenuItem> menuItems = o.getMenuItems();
            for(MenuItem mi:menuItems){
                mi.setOrdereList(list1);
            }
        }
        customer.setOrders(list1);
        return customerRepository.save(customer);
    }
 
    public Optional<Customer> getCustomerByEmail(String email) {
        return customerRepository.findByEmail(email);
    }
 
    public Optional<Customer> getCustomerWithOrders(int customerID) {
        return customerRepository.findByIdWithOrders(customerID);
    }
 
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
 
    public void deleteCustomer(int customerID) {
        customerRepository.deleteById(customerID);
    }
}
