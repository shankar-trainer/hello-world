package com.cts;

import com.cts.config.AppConfig;
import com.cts.model.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        //ApplicationContext
//          ConfigurableApplicationContext context=new AnnotationConfigApplicationContext
//                (Customer.class);
//
//      var c=  context.getBean(Customer.class);

        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        var c=context.getBean(Customer.class);

        System.out.println(c);
//        context.close();
    }

}
