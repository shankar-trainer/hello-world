package com.cts.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerMain {
    public static void main(String[] args) {

        ApplicationContext context=new
                ClassPathXmlApplicationContext
                ("beans1.xml");
        Customer c=context.getBean(Customer.class);

        System.out.println(c.getId());
        System.out.println(c.getName());
    }
}
