package com.coforge.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Person {

    @GeneratedValue
    @Id
    private int id;
    private String name;
    private float salary;

}
