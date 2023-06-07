package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.context.annotation.Lazy;

@Entity
@Data
public class Mobile {

    @Id
    @GeneratedValue
    private int mobileId;
    private String model;
    private float cost;
}
