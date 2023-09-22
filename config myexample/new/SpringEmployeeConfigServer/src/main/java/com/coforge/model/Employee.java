package com.coforge.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties("employee-service")
public class Employee {
	private int id;
	private String name;
	private float salary;

}
