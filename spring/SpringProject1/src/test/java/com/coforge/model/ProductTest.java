package com.coforge.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductTest {

    BeanFactory beanFactory;
    Product product;

    @BeforeEach
    public void setUp(){
        beanFactory=new ClassPathXmlApplicationContext("application.xml");
        product=beanFactory.getBean(Product.class);
         }

    @Test
    public void productTest(){
        System.out.println(product);
        System.out.println("product ");
        System.out.println("\tid : "+product.getPrdId());
        System.out.println("\tname : "+product.getPrdName());
        System.out.println("\tcost : "+product.getPrdCost());

        System.out.println("\nLocation list");
        product.getLocationList().forEach(a->System.out.println("\t"+a));

        System.out.println("\nModel set");
        product.getModelSet().forEach(a->System.out.println("\t"+a));

        System.out.println("\nState ");
        product.getStateMap().entrySet().forEach(a-> System.out.println(a));

    }
}
