package com.cg.DemoConfigurationManagement.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@Profile("prod")
public class ProductionConfig {
	@Bean
	public String getData() {
		
		return "for production";
		
	}

}
