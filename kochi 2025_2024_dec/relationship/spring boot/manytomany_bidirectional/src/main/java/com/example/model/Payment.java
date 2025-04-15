package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

import java.io.Serializable;

@Entity
@Table(name = "Payment")
@Data
public class Payment implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int paymentID;
 
    @OneToOne
    @JoinColumn(name = "OrderID", nullable = false)
    private Order order;
 
    private String paymentMethod; // e.g., Card, Wallet, Cash
    private double amount;
    private String status; // e.g., Successful, Failed
}
