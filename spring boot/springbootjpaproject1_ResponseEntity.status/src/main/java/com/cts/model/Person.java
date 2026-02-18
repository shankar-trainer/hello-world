package com.cts.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data // @Equals, HashCode, getter, setter and toString
public class Person {

    @Id
    @GeneratedValue
    private int personId;
    private  String  personName;
    private int personSalary;


}
