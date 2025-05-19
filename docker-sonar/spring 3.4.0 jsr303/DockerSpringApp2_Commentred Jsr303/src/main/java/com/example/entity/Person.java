package com.example.entity;

import java.time.LocalDate;

import jakarta.persistence.*;
//import jakarta.persistence.GeneratedType;
//import jakarta.persistence.GenerationType;
//import jakarta.validation.constraints.Min;
//import jakarta.validation.constraints.NotBlank;
//import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
//@Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode.
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    @Id
    //@GeneratedValue
    //@NotNull(message = "id is null")
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
//    @NotNull(message = "name is null")
//    @NotBlank(message = "name is blank")
    private String name;

//    @NotNull(message = "salary is null")
//    @Min(value = 10000, message = "minimum salary must of 10000")
    private Float salary;
//    @NotNull(message = "dob is null")
    private LocalDate dob;

}
