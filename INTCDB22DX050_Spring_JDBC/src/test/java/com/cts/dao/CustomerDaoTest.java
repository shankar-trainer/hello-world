package com.cts.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerDaoTest {
    ApplicationContext ctx;

    CustomerDao dao;

    @BeforeEach
    public void setUp() {
        ctx = new ClassPathXmlApplicationContext("application.xml");
        dao = ctx.getBean("dao", CustomerDaoImpl.class);
    }

    @Test
    public void testGetAllCustomer() {
        int size = dao.getAllCustomer().size();
        assertNotEquals(0, size);
    }
}
