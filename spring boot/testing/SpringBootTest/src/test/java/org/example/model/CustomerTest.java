package org.example.model;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CustomerTest {

    Customer customer1;
    Customer customer2;

    @BeforeEach
    public void setUp() {
        customer1 = new Customer(10001, "ram kumar", "ram@gmail.com");
        customer2 = new Customer(10001, "ram kumar", "ram@gmail.com");
    }


    @Test
    public void testCustomerValues() {
        //Assertions.assertNotNull(customer1);
        assertNotNull(customer1);
        Assertions.assertEquals(10001, customer1.getId());
        Assertions.assertEquals("ram kumar", customer1.getName());
        Assertions.assertEquals("ram@gmail.com", customer1.getEmail());
    }

    @Test
    public void testAllCustomer() {
        assertNotNull(customer1);
        assertNotNull(customer2);
        assertEquals(customer1,customer2);

    }
}
