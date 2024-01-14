package com.coforge.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import lombok.Data;
//jsr 303 validation
@Data
public class Employee {

	@Min(value = 10000, message = "id must be minimum 10000")
	@Max(value = 100000, message = "id must be maximum 100000")
	private Integer empId;

	@NotBlank(message = "name is blank")
	@Size(min = 5, max = 20, message = "name must of 5 - 20 chars")
	private  String empName;
	

	@NotNull(message = "salary is null")
	@Min(value = 20000, message = "salary must be minimum 20000")
	@Max(value = 500000, message = "salary must be maximum 5000000")

	private Float empSalary;
	
}
