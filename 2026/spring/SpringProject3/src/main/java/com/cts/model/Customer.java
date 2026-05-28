package com.cts.model;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import java.time.LocalDate;

@Component
@Lazy(value = true)
public class Customer {

    private int id;
    private  String  name;
    private LocalDate dob;

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                '}';
    }
    @PostConstruct
    public void init(){
        System.out.println("customer  init called ");
        this.id=878787;
        this.name="amrendra kumar";
        this.dob= LocalDate.of(1999,12,27);
    }
    @PreDestroy
    public void clean(){
        System.out.println("clean called ");
    }

}
