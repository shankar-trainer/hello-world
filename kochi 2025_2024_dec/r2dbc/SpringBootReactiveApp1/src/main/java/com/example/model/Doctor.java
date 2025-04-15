package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import org.springframework.data.annotation.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {

//	@Id
	private int id;
	private String name;
	private int age;

}
