package org.example.model;

import lombok.Data;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by shankar on 4/5/2023.
 */

@Entity
@Data
public class Kid {

    @Id
    @GeneratedValue
    private int kidId;
    private String kidName;
    private int kidAge;

    @Embedded
    private Toy toy;

}
