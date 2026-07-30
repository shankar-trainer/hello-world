package com.coforge.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Product {

        private int prdid;
        private  String  prdName;
        private float prdCost;

    }


