package com.cg;

import com.cg.dao.CustomerRepository;
import com.cg.model.Customer;
import com.cg.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomerMain //implements CommandLineRunner
{

    public static void main(String[] args) {
        SpringApplication.run(CustomerMain.class, args);
    }

    @Autowired
    CustomerService service;

    @Autowired
    CustomerRepository dao;
/*
    @Override
    public void run(String... strings) throws Exception {

        dao.deleteAll();


        Customer c[] = new Customer[3];
        c[0] = new Customer();
        c[0].setCustomerId(9007);
        c[0].setCustomerName("amit kumar");
        c[0].setCustomerSalary(12000f);

        c[1] = new Customer();
        c[1].setCustomerId(9001);
        c[1].setCustomerName("ranjeet kumar");
        c[1].setCustomerSalary(11000f);

        c[2] = new Customer();
        c[2].setCustomerId(90010);
        c[2].setCustomerName("suresh kumar");
        c[2].setCustomerSalary(450000f);

        for (Customer p :c) {
            service.addCustomer(p);
        }

    }
    */
}
