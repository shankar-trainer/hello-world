package com.coforge.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AppConfig {

	@Bean
	public Calculator myCalc() {
		return new Calculator();
	}
	
	@Bean
	public CalculatorAspect myCalc1() {
		return new CalculatorAspect();
	}
}
