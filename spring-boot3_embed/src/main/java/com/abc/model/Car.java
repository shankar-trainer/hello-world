package com.abc.model;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class Car {

    Integer car_id;
    String model;

}
