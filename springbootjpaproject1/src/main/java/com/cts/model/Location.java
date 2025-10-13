package com.cts.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Transient;
import lombok.Data;

@Embeddable
@Data
public class Location {

    private String city;
    private String location;
    private int pin;

    @Transient
    private String state;
}
