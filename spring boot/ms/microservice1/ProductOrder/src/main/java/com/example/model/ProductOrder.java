package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class ProductOrder {

    @Id
    @GeneratedValue
    private int productOrderId;
    private LocalDate orderDate;
    private String location;
    private int productId;
}
