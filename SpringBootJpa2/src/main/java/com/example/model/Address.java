package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Address {

    @Id
    @GeneratedValue
    private int addrId;
    private String addrLocation;
    private String addrCountry;

      // bidirectional
    @OneToOne(mappedBy = "address")
    private Student student;
}
