package com.coforge.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.coforge.aop.MYCode;
import com.coforge.aop.MyAop;

@Configuration
@EnableAspectJAutoProxy
public class AOPConfig {
	
	@Bean
	public MyAop getMyAop() {
		return new MyAop();
	}
	
	@Bean
	public MYCode getMyCode() {
		return new MYCode();
	}

	
}
