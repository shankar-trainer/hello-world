package com.example.model;

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
 
	
}
