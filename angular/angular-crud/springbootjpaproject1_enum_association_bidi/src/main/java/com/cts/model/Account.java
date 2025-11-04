package com.cts.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class Account {

    @Id
    @GeneratedValue
    private int id;
    private  String name;

    @Enumerated(EnumType.STRING)
    private PaymentType paymentType;

    //@Embedded
    //private Location location;

    @ElementCollection
    @CollectionTable( name="location")
    private Set<Location> location;





}
