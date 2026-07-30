package com.coforge.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue
    private int prdid;
    private  String  prdName;
    private float prdCost;

}
