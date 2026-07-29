package com.cofoge.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Entity
@Data
public class Person {
    @Id
    @GeneratedValue
    private int id;
    private String name;

    @ElementCollection
    private Set<String> hobbies;

    @ElementCollection
    @CollectionTable(name="address1")
    private List<Address> addresses;

}
