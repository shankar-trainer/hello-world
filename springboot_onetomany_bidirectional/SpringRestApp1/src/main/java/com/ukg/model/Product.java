package com.ukg.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Entity
@Data
//@Builder
//@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue
    private long id;
    private String pname;
    private float cost;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER )
    private Customer customer;


}
