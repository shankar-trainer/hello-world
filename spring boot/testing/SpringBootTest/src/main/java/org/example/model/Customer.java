package org.example.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Objects;

//@Setter
//@Getter
@AllArgsConstructor
@NoArgsConstructor
//@ToString
//@EqualsAndHashCode
@Data
@Entity
public class Customer {
    @Id
//    @GeneratedValue
    private int id;
    private String name;
    private  String email;

}
