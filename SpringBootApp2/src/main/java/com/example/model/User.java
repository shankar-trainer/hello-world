package com.example.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@PropertySource(value = "user.properties")

public class User {
	@Value("${user.id}")
	private int id;
	@Value("${user.name1}")
	private String name;
	@Value("${user.salary}")
	private float salary;
	
}
