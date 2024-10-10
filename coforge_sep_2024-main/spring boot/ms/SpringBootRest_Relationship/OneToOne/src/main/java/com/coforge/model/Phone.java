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
public class Phone {

    @GeneratedValue
    @Id
    private int phoneId;
    private String model;

    @JsonIgnoreProperties("phone")
    @OneToOne(mappedBy = "phone", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    Person person;


}
