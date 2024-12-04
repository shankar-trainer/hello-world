package com.coforge.dto;


import lombok.Data;

import java.util.Set;

@Data

public class Person {

    private int personId;
    private String name;

    private Phone phone;

    private Set<Car> carSet;
}
