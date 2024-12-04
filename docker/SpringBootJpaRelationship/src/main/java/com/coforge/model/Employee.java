package com.coforge.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.engine.internal.Cascade;

import java.util.Set;

@Entity
@Data
public class Employee {

    @Id
    @GeneratedValue

    private int id;
    private String name;
    private  float salary ;

    @OneToOne(cascade = {CascadeType.ALL})
    private Address address;

    @OneToMany(cascade = {CascadeType.ALL})
    private Set<Car> carSet;


}
