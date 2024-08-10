package com.ukg.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Entity
@Data
//@Builder
//@AllArgsConstructor
public class Customer {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String ssn;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "customer")
    private Set<Product> productSet;

}
