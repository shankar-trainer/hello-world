package com.abc.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue
    Integer id;
    String name;

    @Embedded
    Address address;

    @ElementCollection(fetch = FetchType.EAGER)
   // @CollectionTable(name="mycarcollection", joinColumns=@JoinColumn(name="mycar_id"))
    Set<Car> carSet;

}
