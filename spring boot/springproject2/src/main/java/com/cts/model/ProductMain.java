package com.cts.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductMain {
    public static void main(String[] args) {
//        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        ApplicationContext context=new ClassPathXmlApplicationContext("beans1.xml");
        Product prd = context.getBean("prd1", Product.class);

        System.out.println(prd);
        System.out.println(prd.getId());
        System.out.println(prd.getName());
        System.out.println(prd.getCost());
    }
}
