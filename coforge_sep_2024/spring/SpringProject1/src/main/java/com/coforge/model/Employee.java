package com.coforge.model;

import lombok.Data;

@Data
public class Employee {

    private int id;
    private String name;
    private float salary;
    private Address address;

}
