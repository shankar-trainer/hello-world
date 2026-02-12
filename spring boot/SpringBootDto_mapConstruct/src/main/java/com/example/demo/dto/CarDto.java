package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarDto {
    private Long id;
    private String brand; // Field name is different from entity's 'make'
    private int seatCount; // Field name is different from entity's 'numberOfSeats'
    private String vehicleType; // Field name is different from entity's 'type'
}
