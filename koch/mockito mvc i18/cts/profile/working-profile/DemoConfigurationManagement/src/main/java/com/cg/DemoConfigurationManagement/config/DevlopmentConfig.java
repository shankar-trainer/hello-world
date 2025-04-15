package com.cg.DemoConfigurationManagement.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
@Profile("dev")
public class DevlopmentConfig {
	
	@Bean
		public String getDataDev() {
			return "for Devlopment";
		}
	}

