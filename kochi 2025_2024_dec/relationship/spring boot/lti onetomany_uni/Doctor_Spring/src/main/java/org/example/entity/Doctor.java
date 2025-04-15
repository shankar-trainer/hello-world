package org.example.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString(exclude = {"patinetSet"})
@EqualsAndHashCode(exclude ={"patientSet"} )

public class Doctor {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int age;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JsonIgnoreProperties("doctor")
    private Set<Patient> patientSet;

}
