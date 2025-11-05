package com.cts.controller;

import com.cts.exception.CustomerException;
import com.cts.model.Customer;
import com.cts.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin("http://localhost:4200")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/customer")
    public List<Customer> getAll() {
        return customerService.getAll();
    }



    @PostMapping("/customer")
    public Customer addCustomer(@RequestBody Customer customer) {
        return customerService.addCustomer(customer);
    }

    @PutMapping("/customer")
    public Customer updateCustomer(@RequestBody Customer customer) {
        return customerService.updateCustomer(customer);
    }

    @GetMapping("/customer/{id}")
//    public Customer searchCustomerById(@PathVariable Integer id) {
    public ResponseEntity<Customer> searchCustomerById(@PathVariable Integer id) {
        try {
            return new ResponseEntity<Customer>( customerService.searchCustomerById(id), HttpStatus.OK);
        }
        catch (CustomerException e){
            return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/customer/{id}")
    public ResponseEntity<Customer> deleteCustomerByid(@PathVariable("id") int id1) {
        try {
            return  new ResponseEntity<>(customerService.deleteCustomerById(id1), HttpStatus.OK);
        }
        catch (CustomerException e){
            return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
        }
    }

}
