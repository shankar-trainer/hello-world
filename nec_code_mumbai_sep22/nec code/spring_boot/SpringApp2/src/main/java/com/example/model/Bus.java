package com.example.model;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component(value = "bus1")

@PropertySource("bus.properties")
public class Bus {

	@Value("${mybus.id}")
	private int busNo;

	@Value("${mybus.name}")
	private String busName;
	
	@Value("${mybus.route}")
	private String busRoute;
}
