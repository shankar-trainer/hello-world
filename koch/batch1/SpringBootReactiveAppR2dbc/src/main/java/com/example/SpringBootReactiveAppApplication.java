package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

import io.r2dbc.spi.ConnectionFactories;
import io.r2dbc.spi.ConnectionFactory;

@SpringBootApplication
@Configuration
@EnableR2dbcRepositories
public class SpringBootReactiveAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootReactiveAppApplication.class, args);
	}

//	@Bean
//	public ConnectionFactoryInitializer connectionFactoryInitializer(ConnectionFactory factory) {
//
//		ConnectionFactoryInitializer initializer = new ConnectionFactoryInitializer();
//		initializer.setConnectionFactory(factory);
//		initializer.setDatabasePopulator(new ResourceDatabasePopulator(new ClassPathResource("table.sql")));
//		return initializer;
//
//	}

	@Bean
	  public ConnectionFactory connectionFactory() {
	    ConnectionFactory connectionFactory = ConnectionFactories.get
	    		("r2dbcs:mysql://localhost:3306/db2?"+
	            "zeroDate=use_round&"+
	            "sslMode=disabled");

	    return connectionFactory;
	  }

	
}
