package com.ukg.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Set;

@Data
@Entity
@Table(name = "ord_customer")
public class Customer {

    @GeneratedValue
    @Id
    private long id;
    private String name;
    private String ssn;

   // private Set<Product> productSet;

}