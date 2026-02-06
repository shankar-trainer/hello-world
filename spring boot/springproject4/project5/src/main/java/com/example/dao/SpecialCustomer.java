package com.example.dao;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("special")
//@Primary
public class SpecialCustomer extends  Customer {

    @PostConstruct
    public void init(){
        System.out.println("special customer");
        setId(100002);
        setName("hari parsad");
    }
}


