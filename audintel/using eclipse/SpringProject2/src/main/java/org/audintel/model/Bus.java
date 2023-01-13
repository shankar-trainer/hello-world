package org.audintel.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@PropertySource("bus.properties")
@Component
public class Bus {
	
	@Value("${bus.id}")
	private long busId;
	
	@Value("${bus.name}")
	private  String busName;
	
	@Value("${bus.route}")
	private  String busRoute;
	
	@Value("${bus.fare}")
	private  float busfare;
}
