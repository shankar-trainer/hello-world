package com.coforge.model;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import lombok.Data;



@Data
public class Person {
	
	@NotNull(message="id is null")
	private Integer personId;
	
	@NotBlank(message = "name is blank")
	@NotNull(message="name is null")
	
	private String personName;
	
	@NotNull(message="salary is null")
	@Min(value = 5000, message = "salary can not less than 5000")
	@Max(value = 500000, message = "salary can not  greater than 500000")
	@Digits(message = "salary must be digits ", integer =6 ,fraction = 2)
	private Float personSalary;
	
	
}
