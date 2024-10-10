package com.coforge.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

//@Data
@Entity
//@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString(exclude = {"person"})
@EqualsAndHashCode(exclude ={"person"} )
public class Car {

    @GeneratedValue
    @Id
    private int carId;
    private String carModel;



}
