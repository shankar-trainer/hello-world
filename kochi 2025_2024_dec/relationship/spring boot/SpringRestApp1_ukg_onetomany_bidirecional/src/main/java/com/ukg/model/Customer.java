package com.ukg.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
//@Data
//@Builder
//@AllArgsConstructor
@Setter
@Getter
@ToString(exclude = {"product"})
@EqualsAndHashCode(exclude = {"product"})
public class Customer {

    @Id
    @GeneratedValue//(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String ssn;

    @JsonIgnoreProperties("customer")
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "customer")
    private Set<Product> productSet;

}
