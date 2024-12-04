package com.coforge.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Builder
public class Person {
    @Id
    @GeneratedValue
 private int id;
 private String name;

 @Embedded
 private Phone phone;

@ElementCollection
@CollectionTable(name="personCar", joinColumns = {@JoinColumn(name = "pid")})
private Set<Car> carSet;

}
