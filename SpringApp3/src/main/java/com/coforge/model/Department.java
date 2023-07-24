package com.coforge.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Department {
 
	private int deptId;
	private String deptName;
	private String deptLocation;
	
}
