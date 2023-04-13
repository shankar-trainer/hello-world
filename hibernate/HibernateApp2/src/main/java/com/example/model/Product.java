package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by shankar on 3/31/2023.
 */
@Entity
public class Product {

    @Id
    @GeneratedValue()
    private int prdId;
    private String prdName;
    private float  prdCost;

    public int getPrdId() {
        return prdId;
    }

    public void setPrdId(int prdId) {
        this.prdId = prdId;
    }

    public String getPrdName() {
        return prdName;
    }

    public void setPrdName(String prdName) {
        this.prdName = prdName;
    }

    public float getPrdCost() {
        return prdCost;
    }

    public void setPrdCost(float prdCost) {
        this.prdCost = prdCost;
    }
}
