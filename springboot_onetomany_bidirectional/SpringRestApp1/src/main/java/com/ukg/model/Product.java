package com.ukg.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

@Entity
//@Data
//@Builder
//@AllArgsConstructor
@Getter
@Setter
@ToString(exclude = {"customer"})
@EqualsAndHashCode(exclude = {"customer"})
public class Product {

    @Id
    @GeneratedValue//(strategy = GenerationType.IDENTITY)
    private long id;
    private String pname;
    private float cost;
                          //productSet
    @JsonIgnoreProperties("productSet")
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER )
    private Customer customer;

}
