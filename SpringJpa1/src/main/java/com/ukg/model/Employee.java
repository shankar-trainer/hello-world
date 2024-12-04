package com.ukg.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString

public class Employee {

    @Id
    private int id;
    private String name;
    private float salary;


}
