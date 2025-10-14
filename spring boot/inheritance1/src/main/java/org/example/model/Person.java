package org.example.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Inheritance(strategy = InheritanceType.JOINED)
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name = "discriminator ", discriminatorType = DiscriminatorType.STRING)
//@DiscriminatorValue("p")
//@Builder
//@NoArgsConstructor
//@AllArgsConstructor

public class Person {

    @Id
    @GeneratedValue
    private int personId;
    private String firstName;
    private String lastName;


}
