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
public class CustomerRepoTest {

    @Autowired
    CustomerRepository repository;

    @BeforeEach
    public void init(){
        Customer c[]=new Customer[3];
        c[0] = Customer.builder().id(1001L).name("ram kumar").ssn("ssn1").build();
        c[1] = Customer.builder().id(1002L).name("shyam kumar").ssn("ssn2").build();
        c[2] = Customer.builder().id(1003L).name("bipin kumar").ssn("ssn3").build();
        repository.saveAll(Arrays.asList(c));
    }

    @Test
    public void  findAllTest(){
     Assertions.assertEquals( repository.findAll().size(),3);
    }

    @Test
    public void  findByIdTest(){
        repository.findAll().forEach(System.out::println);
        Optional<Customer> byId = repository.findById(1001L);
        Assertions.assertTrue(byId.isPresent());
        Assertions.assertEquals(byId.get().getName(),"ram kumar");
    }



}
