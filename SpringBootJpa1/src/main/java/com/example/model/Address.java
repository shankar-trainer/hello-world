package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Address {

    @Id
    @GeneratedValue
    private int addressId;
    private String addressLocation;
    private int addressPin;
    private String addressState;
    private String addressCountry;
}
