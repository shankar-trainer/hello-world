package com.example.model;

import jakarta.persistence.GeneratedValue;
import lombok.Data;

@Data
public class Product {
    private int productId;
    private String productName;
    private float productCost;
}
