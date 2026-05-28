package com.cts;

import com.cts.config.AppConfig;
import com.cts.model.Address;
import com.cts.model.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AddressMain {
    public static void main(String[] args) {

        ApplicationContext context=new
                AnnotationConfigApplicationContext(AppConfig.class);
        var c=context.getBean(Address.class);

        System.out.println(c);
    }

}
