package com.coforge.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
@Component("dept1")
@Data
@Scope("prototype")
public class Department {

    private int depratmentId;
    private String depratmentName;
    @Autowired
    private Address address;

    @PostConstruct
    public void init() {
        System.out.println("init called "+getClass().getName());
        this.depratmentId = 66878787;
        this.depratmentName = "Transport";
    }

    @PreDestroy
    public void clean() {
        System.out.println("clean called "+getClass().getName());
    }

}
