package com.cts.web;

import com.cts.dto.CustomerDTO;
import com.cts.exception.CustomerException;
import com.cts.model.Customer;
import com.cts.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @RequestMapping("/customer")
    public ResponseEntity<List<CustomerDTO>> getAllCustomer() {
        try {
            return new ResponseEntity<>(customerService.getAllCustomer(), HttpStatus.FOUND);
        } catch (CustomerException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping("/customer1")
    public ResponseEntity<List<Customer>> getAllCustomer1() {
        try {
            return new ResponseEntity<>(customerService.getAllCustomer1(), HttpStatus.FOUND);
        } catch (CustomerException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/customer")
    public CustomerDTO addCustomer(@RequestBody CustomerDTO dto) {
        return customerService.addCustomer(dto);
    }
}
