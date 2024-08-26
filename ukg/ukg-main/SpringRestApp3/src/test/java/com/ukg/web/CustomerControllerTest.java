package com.ukg.web;

import com.ukg.model.Customer;
import com.ukg.repository.CustomerRepository;
import com.ukg.service.CustomerService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;

//@DataJpaTest
@SpringBootTest
public class CustomerControllerTest {

    @Autowired
    CustomerController controller;

    @Autowired
    private CustomerService service;

    @Autowired
    CustomerRepository repository;

    @BeforeEach
    public void init() {
        Customer c[] = new Customer[]{
                new Customer(1001, "ram kumar", "ssn1233"),
                new Customer(1002, "shyam kumar", "ssn1234"),
                new Customer(1003, "amit kumar", "ssn12335"),
        };
        repository.saveAll(Arrays.asList(c));
    }

    @Test
    public void getAllCustomer() {
        List<Customer> body = controller.getAllCustomer().getBody();
        Assertions.assertEquals(body.size(), 3);
        System.out.println(body.get(0));
        Assertions.assertEquals(body.get(0), new Customer(1001, "ram kumar", "ssn1233"));

    }
@Test
    public void getAllCustomer1() {
    ResponseEntity<List<Customer>> allCustomer = controller.getAllCustomer();
    HttpStatusCode statusCode = allCustomer.getStatusCode();
    Assertions.assertEquals(statusCode, HttpStatus.FOUND);
}
}
//https://stackoverflow.com/questions/71766354/spring-boot-restcontroller-autowired-null-in-unit-tests
//https://spring.io/guides/gs/testing-web
/*
@SpringBootTest
@AutoConfigureMockMvc
class TestingWebApplicationTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void shouldReturnDefaultMessage() throws Exception {
		this.mockMvc.perform(get("/")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString("Hello, World")));
	}
}


 */