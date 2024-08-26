package com.ukg.repository;

import com.ukg.model.Customer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Arrays;
import java.util.Optional;

@DataJpaTest
public class CustomerRepositoryTest {

    @Autowired
    private CustomerRepository repository;
    Customer c[];

    @BeforeEach
    public void setUp(){
        c=new Customer[]{
                Customer.builder().name("shyam kumar").ssn("ssn123").build(),
                Customer.builder().name("aman kumar").ssn("ssn124").build(),
                Customer.builder().name("pawan kumar").ssn("ssn125").build(),
        };
        repository.saveAll(Arrays.asList(c));
    }

    @Test
    public  void customerAllTest(){
        Assertions.assertEquals(repository.findAll().size(),3);
    }

    @Test
    public  void customerFindByIdTest(){
        System.out.println(repository.findAll());

        Optional<Customer> byId = repository.findById(1L);
        System.out.println(byId.get());

        Assertions.assertTrue(byId.isPresent());
        Assertions.assertEquals(byId.get(),c[0]);
    }
}
