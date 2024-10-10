package com.coforge.dto;

import lombok.*;

@Data
public class Phone {
    private int phoneId;
    private String model;

    Person person;
}
