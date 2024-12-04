package com.example.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "addr")
public class Address {

    @Id
    @GeneratedValue
    private int id;
    @Column(name = "loc",length = 20, nullable = false)
    private String location;
    private String city;



}
