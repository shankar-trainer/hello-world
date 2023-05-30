package com.example.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
//@RequiredArgsConstructor
@NoArgsConstructor
public class Car {
    private int regNo;
    private String model;
    private double cost;

}
