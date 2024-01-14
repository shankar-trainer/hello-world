package com.coforge.model;

import lombok.Data;

@Data
public class Employee {

	private int id;
	private  String name;
	private  float salary;
	
	
}
// create table employee(id int primary key, name varchar(20), salary float);