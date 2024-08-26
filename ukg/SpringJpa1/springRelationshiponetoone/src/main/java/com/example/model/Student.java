package com.example.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Fetch;

import java.util.Set;

@Data
@Entity
@Table(name = "stud")
public class Student {

    @Id
    @GeneratedValue
    private int roll;
    private String name;
    private String subject;
    private float marks;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "addr_id")
    private Address address;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)

    private Set<Course> courseSet;

}
