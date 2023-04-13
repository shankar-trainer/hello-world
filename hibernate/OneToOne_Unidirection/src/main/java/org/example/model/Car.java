package org.example.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by shankar on 4/5/2023.
 */
@Entity
@Data
public class Car {

    @Id
    @GeneratedValue
    private int carRegNo;
    private String  carModel;
    private  float carCost;

}
