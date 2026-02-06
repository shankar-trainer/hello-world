package com.example;

import com.example.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CustomerMain {

    public static void main(String[] args) {
        ApplicationContext context=new
                AnnotationConfigApplicationContext(CustomerService.class);

        CustomerService bean = context.getBean(CustomerService.class);

        bean.info();
    }
}
