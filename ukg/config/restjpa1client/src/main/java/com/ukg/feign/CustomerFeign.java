package com.ukg.feign;

import com.ukg.model.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name = "rest-application-rest1")
public interface CustomerFeign {

    @GetMapping("/get/{id}")
    public ResponseEntity<Customer> findCustomerById(@PathVariable("id") long id);

    @RequestMapping("/all")
    public ResponseEntity<List<Customer>> getAllCustomer();
}