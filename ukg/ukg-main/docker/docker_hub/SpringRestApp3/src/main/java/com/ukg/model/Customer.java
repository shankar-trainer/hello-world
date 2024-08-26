package com.ukg.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
//    public Customer(long id, String name, String ssn) {
//        this.id = id;
//        this.name = name;
//        this.ssn = ssn;
//    }

    @Id
    //@GeneratedValue
    private long id;
    private String name;
    private String ssn;

//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    private Set<Product> productSet;

}
