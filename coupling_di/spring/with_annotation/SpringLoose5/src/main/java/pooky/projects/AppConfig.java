package pooky.projects;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import pooky.projects.beans.MockMessageService;
import pooky.projects.beans.MockMessageService2;

@Configuration
@ComponentScan("pooky.projects")
public class AppConfig {
	
	/* 
	@Bean
	MessageService getMockMessageService() {
		return new MockMessageService();
	}
	
	@Bean
	MessageService getMockMessageService2() {
		return new MockMessageService2();
	}*/
	
}
