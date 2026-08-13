package com.cts.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;

@Entity
@Data
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int personId;
    private String personName;
    private float personSalary;

    @Enumerated(EnumType.STRING)
    private Gender gender;

}
