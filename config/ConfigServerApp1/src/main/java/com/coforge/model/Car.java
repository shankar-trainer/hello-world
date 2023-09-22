package com.coforge.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@ConfigurationProperties(prefix = "car")
@Component
public class Car {

	private int id;
	private  String name;
	private float cost;
	
}
