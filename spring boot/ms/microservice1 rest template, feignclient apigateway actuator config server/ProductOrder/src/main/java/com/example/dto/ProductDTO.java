package com.example.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.Data;
@Data
public class ProductDTO {

    private int productId;
    private String productName;
    private  float cost;

}