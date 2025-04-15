package com.coforge.service;

import com.coforge.error.CustomerException;
import com.coforge.model.Customer;
import com.coforge.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer addCustomer(Customer customer) throws CustomerException {
        if (customerRepository.findById(customer.getCustomerId()).isPresent()) {
            throw new CustomerException("id already present");
        } else
            return customerRepository.save(customer);
    }

    public Customer updateCustomer(Customer customer) throws CustomerException {
        if (customerRepository.findById(customer.getCustomerId()).isEmpty()) {
            throw new CustomerException("id not present");
        } else
            return customerRepository.save(customer);
    }

    public Customer searchCustomer(long id) throws CustomerException {
        if (customerRepository.findById(id).isEmpty()) {
            throw new CustomerException("id not found");
        } else
            return customerRepository.findById(id).get();
    }

    public Customer deleteCustomer(long id) throws CustomerException {
        if (customerRepository.findById(id).isEmpty()) {
                throw new CustomerException("id not  present");
        } else {
            Customer customer = customerRepository.findById(id).get();
            customerRepository.delete(customer);
            return customer;
        }
    }

    public List<Customer> getAllCustomer() throws CustomerException {
        if (customerRepository.findAll().isEmpty()) {
            throw new CustomerException("list is empty");
        } else
            return customerRepository.findAll();
    }
}
