package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.UUID;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
//@ToString
//@Setter
//@Getter

@Data
public class Product {
    @Id
    @GeneratedValue//(strategy = GenerationType.IDENTITY)
    //private Long id;
    private UUID id;
    private String name;
    private double price;


    // Getters and Setters
//    public Long getId() { return id; }
//    public void setId(Long id) { this.id = id; }
//    public String getName() { return name; }
//    public void setName(String name) { this.name = name; }
//    public double getPrice() { return price; }
//    public void setPrice(double price) { this.price = price; }
}