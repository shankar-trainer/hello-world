package com.coforge.controller;

import com.coforge.dao.CustomerRepository;
import com.coforge.model.Customer;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class CustomerController {

    @Autowired
    private CustomerRepository repository;

    //http://localhost:9090/customer
    @GetMapping("/customer")
    public List<Customer> getCustomerList() {
        return repository.findAll();
    }

    @PostMapping("/customer")
    public Customer addCustomer(@RequestBody Customer customer) {
        return repository.save(customer);
    }

    //http://localhost:9090/customer/2
    @DeleteMapping("/customer/{id}")
    public Customer deleteCustomer(@PathVariable("id") int customerId) {
        Optional<Customer> byId = repository.findById(customerId);
        if (byId.isPresent()) {
            Customer customer = byId.get();
            repository.delete(byId.get());
            return customer;
        } else
            return null;
    }

    //http://localhost:9090/customer/2
    @GetMapping("/customer/{id}")
    public Customer getCustomerSearchById(@PathVariable("id") int id) {
        return repository.findById(id).get();
    }

    //http://localhost:9090/customer/?id=2
    @GetMapping("/customer/")
    public Customer getCustomerSearchById1(@RequestParam("id") int id) {
        Optional<Customer> byId = repository.findById(id);
        if (byId.isPresent())
            return byId.get();
        else
            return null;
    }

    @PutMapping("/customer")
    public Customer updateCustomer(@RequestBody Customer customer) {
        return repository.save(customer);
    }
}
