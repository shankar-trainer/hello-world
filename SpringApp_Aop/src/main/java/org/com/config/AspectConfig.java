package org.com.config;


import org.com.model.Calculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
//@ComponentScan(basePackages = "org.com.model")
public class AspectConfig {

	@Bean
	public Calculator getCalculator() {
		return new Calculator();
	}

	@Bean
	public CalculatorAspect getCalculatorAspect() {
		return new CalculatorAspect();
	}

}
