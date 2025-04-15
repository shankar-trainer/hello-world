package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.annotation.Id;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

import io.r2dbc.spi.ConnectionFactories;
import io.r2dbc.spi.ConnectionFactory;
import org.springframework.r2dbc.connection.init.ConnectionFactoryInitializer;
import org.springframework.r2dbc.connection.init.ResourceDatabasePopulator;
import org.springframework.web.reactive.config.EnableWebFlux;

@SpringBootApplication
//@Configuration
@EnableR2dbcRepositories
//@EnableWebFlux
public class SpringBootReactiveAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootReactiveAppApplication.class, args);
	}

	@Bean
	public ConnectionFactoryInitializer connectionFactoryInitializer(ConnectionFactory factory) {
		ConnectionFactoryInitializer initializer = new ConnectionFactoryInitializer();
		initializer.setConnectionFactory(factory);
		//initializer.setDatabasePopulator(new ResourceDatabasePopulator(new ClassPathResource("table.sql")));
		return initializer;
	}

//	@Bean
//	  public ConnectionFactory connectionFactory() {
//	    ConnectionFactory connectionFactory = ConnectionFactories.get
//	    		("r2dbcs:mysql://localhost:3306/db2?"+
//	            "zeroDate=use_round&"+
//	            "sslMode=disabled");
//
//	    return connectionFactory;
//	  }
}
/*
http://localhost:8080/add
  
  { "doctorName": "rakesh", "doctorAge": 34 }

http://localhost:9090/api/tutorials

  
    {
        "title": "title111",
        "description": "book description",
        "published": false
    }
===================================
 if
	@Id
	private int id;
	private String name;
	private int age;
  then in table make id as auto_increment 
 
  http://localhost:8080/add
  
  {
"name": "rakesh",
    "age": 34    
  }
 if no @id then in table no need of auto increment
	private int id;
	private String name;
	private int age;

  http://localhost:8080/add
  {
   "id":1001
   "name": "rakesh",
    "age": 34    
  }





*/
  
 




