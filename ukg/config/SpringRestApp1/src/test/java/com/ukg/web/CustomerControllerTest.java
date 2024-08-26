package com.ukg.web;


import com.ukg.model.Customer;
import com.ukg.repository.CustomerRepository;
import com.ukg.service.CustomerService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;
@SpringBootTest
public class CustomerControllerTest {

    @Autowired
    private CustomerController controller;

    @Autowired
    private CustomerService service;

    @Autowired
    private CustomerRepository repository;
    Customer c[];

    @BeforeEach
    public void setUp() {
        c = new Customer[]{
                Customer.builder().name("shyam kumar").ssn("ssn123").build(),
                Customer.builder().name("aman kumar").ssn("ssn124").build(),
                Customer.builder().name("pawan kumar").ssn("ssn125").build(),
        };
        repository.saveAll(Arrays.asList(c));
    }


    @Test
    public void getAllCustomer() {
        ResponseEntity<List<Customer>> allCustomer = controller.getAllCustomer();
        List<Customer> body = allCustomer.getBody();
        Assertions.assertEquals(body.size(), 3);
        Assertions.assertEquals(allCustomer.getStatusCode(), HttpStatus.OK);
    }

    @Test
    public void checkCustomerStatus() {
        ResponseEntity<Customer> customerById = controller.findCustomerById(1);
        Assertions.assertEquals(customerById.getStatusCode(), HttpStatus.FOUND);
    }
}