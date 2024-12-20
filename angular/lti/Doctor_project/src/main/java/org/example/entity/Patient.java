package org.example.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
//@Builder
//@ToString(exclude = {"doctor"})
//@EqualsAndHashCode(exclude ={"doctor"} )

public class Patient {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int age;
    private String location;

    @ManyToOne(cascade = CascadeType.ALL)
    private Doctor doctor;

}
