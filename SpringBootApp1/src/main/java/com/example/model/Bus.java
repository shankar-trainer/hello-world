package com.example.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@PropertySource("bus.properties")
public class Bus {

	// @Value("10001")
	@Value("${bus.id}")
	private int busId;

//	@Value("dtc bus")
	@Value("${bus.name}")
	private String busName;

	// @Value("noida to indiagate")
	@Value("${bus.route}")
	private String busRoute;

//	@Value("50")
	@Value("${bus.fare}")
	private float busFare;
}
