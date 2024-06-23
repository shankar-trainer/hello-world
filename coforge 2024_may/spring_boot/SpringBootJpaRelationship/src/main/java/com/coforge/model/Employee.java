package com.coforge.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
//@Builder
//@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue

    private int id;
    private String name;
    private  float salary ;

    @OneToOne
    private Address address;


}
