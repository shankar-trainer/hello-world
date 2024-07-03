package com.coforge.model;

import lombok.Data;

import java.util.Set;

@Data
public class Employee {
    private int id;
    private String name;
    private  float salary ;

    private Address address;

    private Set<Car> carSet;


}
