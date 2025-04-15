package org.audintel.config;

import org.audintel.model.Bus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.audintel.model"})
public class BusConfiguration {

	@Bean
	public Bus getTelenganaBus() {
	     return new Bus();
	}
	
}
