package com.example.service;

import com.example.dao.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

@Service
@ComponentScan("com.example.dao")
public class CustomerService {
    @Autowired
//    @Qualifier("special")
  //  @Qualifier("regular")
    Customer customer;

    public void info(){
        System.out.println(customer);
    }
}
