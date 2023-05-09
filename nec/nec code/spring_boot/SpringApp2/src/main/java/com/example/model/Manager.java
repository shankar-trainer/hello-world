package com.example.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Manager {

	private int managerId;
	private String  managerName;
	private LocalDate managerDob;
	private float  managerSalary;
	
}
