package com.cts.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;

@Entity
public class Customer {

    @NotNull(message = "id is blank")
    @Id
    private Integer id;
    @NotBlank(message = "name is blank")
    @Size(min = 5, max = 15 , message = "name must of 5 -15 chars")
    private String  name;

    @NotNull(message = "salary is blank")
    @Min(value = 5000, message = "min salary is 5000")
    @Max(value = 50000, message = "max salary is 50000")
    private  Float salary;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }
}
