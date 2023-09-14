package com.coforge.model;

import lombok.Data;

@Data
public class Employee {

	private Integer id;
	private String password;
	private String name;
	private Float salary;
	
	private String hobbies[];
	private String gender[];
	
}
