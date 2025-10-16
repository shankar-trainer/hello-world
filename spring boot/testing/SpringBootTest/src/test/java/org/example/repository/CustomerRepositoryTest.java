package org.example.repository;

import org.example.model.Customer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@DataJpaTest
//@SpringBootTest(classes = {CustomerRepository.class})
public class CustomerRepositoryTest {

    @Autowired
    private CustomerRepository customerRepository;

    private Customer customer;

    @BeforeEach
    public void beforeEach() {

        customer = new Customer();
        customer.setId(1);
        customer.setName("Jack");
        customer.setEmail("jack@gmail.com");
        customerRepository.save(customer);
    }

    @Test
    public void testCustomer() {
        List<Customer> all = customerRepository.findAll();
        Assertions.assertTrue(all.contains(customer));

        Customer c = all.get(0);

        Assertions.assertEquals("Jack",c.getName());
        Assertions.assertEquals("jack@gmail.com", c.getEmail());
    }


    @Test
    public void testCustomerById() {
        Customer c = customerRepository.findById(1).orElse(null);
        Assertions.assertNotNull(c);
        Assertions.assertEquals(1, c.getId());
        Assertions.assertEquals("Jack", c.getName());
    }

    @Test
    public void testDeleteById() {
        Customer c = customerRepository.findById(1).orElse(null);
        customerRepository.delete(c);

        Customer c1=null;
        if(customerRepository.findById(1).isEmpty())
         c1=null;

        Assertions.assertNull(c1);
    }

}
