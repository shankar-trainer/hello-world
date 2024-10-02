package com.coforge.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.junit.jupiter.api.Assertions;

public class EmployeeTest {

    BeanFactory beanFactory;
    Employee employee,employee1;

    @BeforeEach
    public void setUp(){
        beanFactory=new ClassPathXmlApplicationContext("beans.xml");
        employee = beanFactory.getBean("employee", Employee.class);
        employee1 = beanFactory.getBean("employee", Employee.class);
    }

    @Test
    public void employeeTest(){
        employee1.setName("suman kumar");
        Assertions.assertNotEquals(employee,employee1);

        Assertions.assertNotNull(employee);
        Assertions.assertEquals(employee.getId(),20001);
        Assertions.assertEquals(employee.getName(),"amit kumar");
        Assertions.assertEquals(employee.getSalary(),80000);
    }
}
