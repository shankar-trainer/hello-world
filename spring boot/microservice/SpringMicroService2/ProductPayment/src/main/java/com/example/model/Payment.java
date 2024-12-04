package com.example.model;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Payment {
    @Id
    @GeneratedValue
    private int paymentId;
    private float paymentAmount;
    private String paymentMode;

    @Embedded
    private Order order;


}
