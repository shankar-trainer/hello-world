package com.example.model;

import java.time.LocalDate;
import java.util.Date;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class Employee {
	
	//@NotNull(message = "")
	private Integer id;
	
	//@NotBlank(message = "")
    private  String name;
	
	//@NotNull(message = "")
    private  Float salary;
    
    private LocalDate dob1;
 
	
}
