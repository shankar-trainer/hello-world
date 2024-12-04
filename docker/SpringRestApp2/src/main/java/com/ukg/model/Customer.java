package com.ukg.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class Customer {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String ssn;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Product> productSet;

}
