package com.cts.main;

import com.cts.model.Address;
import com.cts.model.Employee;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class AddressMain {
    public static void main(String[] args) {
//        BeanFactory beanFactory = new
//        ApplicationContext beanFactory = new
        ConfigurableApplicationContext beanFactory = new
//                ClassPathXmlApplicationContext("beans.xml");
                FileSystemXmlApplicationContext
                ("C:\\Users\\2383505\\IdeaProjects\\SpringProject1\\src\\main\\resources\\beans.xml");

//        Address address=(Address) beanFactory.getBean("address");
        Address address = beanFactory.getBean("address", Address.class);

        System.out.println("Address is ");
        System.out.println("\t id  " + address.getAddrId());
        System.out.println("\t location  " + address.getLocation());
        System.out.println("\t city  " + address.getCity());

        beanFactory.close();
    }
}
