package com.example;

import com.example.config.SpringConfig;
import com.example.model.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest(classes = {com.example.model.Employee.class,com.example.config.SpringConfig.class})
public class SpringApp1ApplicationTests {

    ApplicationContext ctx;
    Employee employee = null;

    @BeforeEach
    public void init() {
        ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        employee = ctx.getBean(Employee.class);
    }

    @Test
   public void contextLoads() {
        Employee employee1 = new Employee();
        employee1.setId(10001);
        employee1.setName("amarjeet kumar");
        employee1.setSalary(45000);
        Assertions.assertNotNull(employee);
        Assertions.assertEquals(employee, employee1);
    }

}
