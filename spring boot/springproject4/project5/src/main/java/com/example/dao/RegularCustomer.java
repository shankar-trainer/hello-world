package com.example.dao;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("regular")
@Primary
public class RegularCustomer extends  Customer {

    @PostConstruct
    public void init(){
        System.out.println("regular customer");
        setId(100001);
        setName("suresh parsad");
    }
}


