package com.cts.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
//@Table(name = "cust")
@Data
public class Customer {
    @Id
    @Column(name = "customer_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "customer_name", length = 20, nullable = false)
    private String name;

    @Column(name = "customer_salary", nullable = false)
    private float salary;

    private LocalDate dob;




}
