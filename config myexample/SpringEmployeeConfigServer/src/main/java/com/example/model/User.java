package com.example.model;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ConfigurationProperties("user-service")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

	private int id;
	private String name;
	private float salary;
	
}
