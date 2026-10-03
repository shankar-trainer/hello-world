package com.productservice.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;

@Configuration
public class SwaggerConfig {

	@Bean
	OpenAPI customOpenAPI() {
		Info info = new Info()
				.title("Product API")
				.version("1.0.0")
				.description("A simple product API using Spring Boot and Spring WebFlux");

		List<Server> servers = List.of(new Server().url("http://localhost:8080"));

		return new OpenAPI().info(info).servers(servers);
	}

}
