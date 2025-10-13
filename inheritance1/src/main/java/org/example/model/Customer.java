package org.example.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
//@DiscriminatorValue("C")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Customer extends   Person{
    private String  location;
    private String state;
    private String departmentName;

}
