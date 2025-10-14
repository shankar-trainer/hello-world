package org.example.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
//@DiscriminatorValue("E")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Employee  extends   Person{
    private LocalDate joiningDate;
    private String departmentName;

}
