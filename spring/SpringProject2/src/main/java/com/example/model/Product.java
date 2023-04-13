package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by shankar on 4/13/2023.
 */

@Data
@AllArgsConstructor
public class Product {
    private int productId;
    private String productName;
    private float productCost;
}
