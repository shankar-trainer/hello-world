package com.abc.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class Customer {
    private long id;
    private String name;
    private LocalDate dob;
}
