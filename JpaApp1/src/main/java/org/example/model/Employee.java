package org.example.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Data
public class Employee {
    @Id
    private int id;
    private String name;
    private float salary;
    private LocalDate doj;
}
