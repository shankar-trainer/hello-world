package com.cts.service;

import com.cts.dao.AddressRepository;
import com.cts.dao.CustomerRepository;
import com.cts.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository repository;

    @Autowired
    AddressRepository addressRepository;

    public List<Customer> getAll() {
        return repository.findAll();
    }

    public Customer addCustomer(Customer customer) {
//        Address address = customer.getAddress();
  //      addressRepository.save(address);
    //    customer.setAddress(address);

        System.out.println("add customer called ");
        return repository.save(customer);
    }

    public Customer updateCustomer(Customer customer) {
        return repository.save(customer);
    }

    public Customer searchCustomerById(Integer id) {
        return repository.findById(id).get();
    }

    public Customer deleteCustomerById(Integer id) {
        var cust = repository.findById(id).get();
        repository.deleteById(id);
        return cust;
    }



}
