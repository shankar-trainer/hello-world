package org.example.model;

import lombok.Data;

import javax.persistence.Embeddable;

/**
 * Created by shankar on 4/5/2023.
 */
@Embeddable
@Data
public class Toy {

    private int toyId;
    private String toyName;
    private float toyCost;
}
