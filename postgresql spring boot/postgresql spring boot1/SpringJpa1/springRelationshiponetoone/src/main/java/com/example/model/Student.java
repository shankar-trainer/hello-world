package com.example.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "stud")
public class Student {

    @Id
    @GeneratedValue
    private int roll;
    private String name;
    private String subject;

    @OneToOne
    private Address address;


}
