package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Student {

    @Id
    @GeneratedValue
    private int empId;
    private  String empName;
    private float empSalary;

    @OneToOne
    private Address address;

}
