package com.audintel.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
public class Employee {

	@NotNull(message = "id is null")
	@Id
	private Integer id;

	@Size(min = 5, max = 20, message = "name sholud be of min 5 and max 20 chars")
	@NotEmpty(message = "name cannot be empty")
	private String name;

	@NotNull(message = "salary is null")
	@Digits(fraction = 2, integer = 7, message = "salary must be numeric of 7 integer and two decimal")
	private Float salary;

}
