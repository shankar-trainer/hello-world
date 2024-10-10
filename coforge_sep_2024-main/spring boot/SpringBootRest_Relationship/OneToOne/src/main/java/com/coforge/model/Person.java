package com.coforge.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

//@Data
@Entity
//@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString(exclude = {"phone"})
@EqualsAndHashCode(exclude ={"phone"} )
public class Person {

    @GeneratedValue
    @Id
    private int personId;
    private String name;

    @JsonIgnoreProperties("person")
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Phone phone;

    @OneToMany(cascade =CascadeType.ALL,fetch = FetchType.EAGER )
    private Set<Car> carSet;
}
