package com.ukg.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CustomerTest {

    Customer customer;

    @BeforeEach
    public void customerSetUp() {
        customer = Customer.builder().id(1001).name("ram kumar").build();
    }

    @Test
    public void test1() {
        Assertions.assertEquals(customer.getId(), 1001);
        Assertions.assertEquals(customer.getName(), "ram kumar");
    }
}
