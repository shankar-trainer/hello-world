package com.coforge.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Customer {
    private int customerId;
    private String customerName;
    private float customerSalary;

    public void init(){
        System.out.println("init method called in .."+getClass().getName());
        this.customerId=768778;
        this.customerName="shubham sharma";
        this.customerSalary=55555;
    }

}
