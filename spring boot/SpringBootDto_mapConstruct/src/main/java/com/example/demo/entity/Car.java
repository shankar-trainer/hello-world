package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car {
    private Long id;
    private String make;
    private int numberOfSeats;
    private String type; // e.g., SEDAN, SUV
}
