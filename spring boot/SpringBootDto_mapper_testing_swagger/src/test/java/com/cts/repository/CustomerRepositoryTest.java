package com.cts.repository;

import com.cts.model.Customer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;

import java.util.List;
import java.util.Optional;

@DataJpaTest
public class CustomerRepositoryTest {

    @Autowired
    CustomerRepository customerRepository;
    Customer customer;

    @BeforeEach
    public void init(){
        customer=new Customer();
        customer.setName("suresh babu");
        customer.setSalary(20000);
        customerRepository.save(customer);
    }

    @Test
    public void customerTest(){
        List<Customer> all = customerRepository.findAll();
        Customer customer1 = all.get(0);
        Assertions.assertEquals(customer.getName(),customer1.getName());
        Assertions.assertEquals(customer.getSalary(),customer1.getSalary());
    }

    @Test
    public void searchById(){
        Customer customer1 = customerRepository.findAll().get(0);
        int id = customer1.getId();
        Customer customer2 = customerRepository.findById(id).get();
        customer.setId(id);
        Assertions.assertEquals(customer,customer1);
    }

    @Test
    public void searchById1(){
        Optional<Customer> byId = customerRepository.findById(87787);
        // Customer customer3 = byId.get();
        // Assertions.assertNull(customer1);
        Assertions.assertThrows(java.util.NoSuchElementException.class,()->
                byId.get(),"No value present"
        );
    }


        @Test
    public void deleteCustomer(){
        Customer customer1 = customerRepository.findAll().get(0);
        customerRepository.deleteById(customer1.getId());
        Optional<Customer> byId = customerRepository.findById(customer1.getId());
        Assertions.assertThrows(java.util.NoSuchElementException.class,()->
              byId.get(),"No value present"
        );
        Assertions.assertEquals(byId.isEmpty(),true);
    }
}
