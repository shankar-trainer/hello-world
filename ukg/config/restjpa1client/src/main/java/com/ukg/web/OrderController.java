package com.ukg.web;

import com.ukg.feign.CustomerFeign;
import com.ukg.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    CustomerFeign customerFeign;

    @GetMapping("/allCustomer1")
    public ResponseEntity<List<Customer>>  getAllCustomer() {
          return  customerFeign.getAllCustomer();
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Customer> findCustomerById(@PathVariable("id") long id) {
     return  customerFeign.findCustomerById(id);
    }
}















//https://github.com/spring-cloud/spring-cloud-openfeign/issues/874
//https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/302