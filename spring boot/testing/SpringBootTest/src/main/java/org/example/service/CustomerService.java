package org.example.service;

import org.example.model.Customer;
import org.example.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public List<Customer> getAllCustomer() {
        return customerRepository.findAll();
    }

    public Customer deleteCustomerById(int id) {
        var c=customerRepository.findById(id).get();
        if(customerRepository.findById(id).isPresent()){
            customerRepository.deleteById(id);
            return  c;
        }
        else {
            throw new IllegalArgumentException("Customer not found");
        }
    }

}
