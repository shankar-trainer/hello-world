package com.example.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.context.annotation.Lazy;

import java.util.Set;

@Entity
@Data
//@AllArgsConstructor
@NoArgsConstructor
//@RequiredArgsConstructor

public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int personId;
    //@NonNull
    private String personName;
    //@NonNull
    private int personSalary;

    @OneToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name="addressId")
    Address address;


    @OneToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST}   )
    Set<Mobile> mobileSet;


}
