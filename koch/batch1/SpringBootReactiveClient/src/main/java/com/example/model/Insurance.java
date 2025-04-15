package com.example.model;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Insurance {

	private int insuranceId;
	private String insuranceName;
	private int  years;
	private LocalDate startDate;

	
}
