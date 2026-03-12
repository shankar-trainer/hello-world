package com.coforge.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.Set;

@Data
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private  String name;
    private LocalDate dob;

    @OneToOne(cascade = CascadeType.ALL)
    private Car car;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Address> addressSet;

}
