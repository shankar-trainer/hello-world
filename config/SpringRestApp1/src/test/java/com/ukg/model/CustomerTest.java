package com.ukg.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CustomerTest {

    Customer customer1;
    Customer customer2;
    @BeforeEach
    public void  init(){
        customer1= Customer.builder().id(10001).name("shyam kumar").ssn("ssn123").build();
        customer2= Customer.builder().id(10001).name("shyam kumar").ssn("ssn123").build();
//        customer=new Customer();
//        customer.setId(10001);
//        customer.setName("shyam kumar");
//        customer.setSsn("ssn123");
    }
    @Test
    public void test1(){

        Assertions.assertEquals(customer1.getId(),10001);
        Assertions.assertEquals(customer1.getName(),"shyam kumar");
        Assertions.assertEquals(customer1.getSsn(),"ssn123");
        Assertions.assertEquals(customer1,customer2);
    }

}
