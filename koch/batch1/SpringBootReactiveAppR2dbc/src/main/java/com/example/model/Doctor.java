package com.example.model;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Doctor {

	@Id
	private int doctorId;
	private  String  doctorName;
	private int doctorAge;
	
	
}
