package com.coforge.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer  addrNo;
    private   String city;
    private String  state;


}
