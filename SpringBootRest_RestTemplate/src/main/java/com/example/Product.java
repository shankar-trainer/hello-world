package com.example;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
//@Table(name="prd2")
public class Product {
    @Id
     @GeneratedValue
    @Column(name="prdId")
    private int productId;
    @Column(name="prdName",length = 20,nullable = false)
    private String productName;
    @Column(name="cost",precision = 2)
    private float productCost;
    @Column(name="mfd",nullable = false)
    private LocalDate productMfd;
}
