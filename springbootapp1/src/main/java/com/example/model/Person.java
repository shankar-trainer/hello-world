package com.example.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "person2")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pid")
    private int id;
    @Column(name = "person_name", length = 20, nullable = false)
    private String name;

    private float salary;


}
