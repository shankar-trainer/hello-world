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
}
/*
 if  @id then in table add auto increment for the doctorId
 CREATE TABLE IF NOT EXISTS  doctor(doctor_id int primary key auto_increment, doctor_name varchar(20), doctor_age int);
     @Id
    private int doctorId;
    private String doctorName;
    private int doctorAge;
     then in table make id as auto_increment 
 
  http://localhost:8080/add
  
  {
     "doctorName": "rakesh kumar",
    "doctorAge": 34    
  }
   
   if no @id then in table no need of auto increment
        @Id
    private int doctorId;
    private String doctorName;
    private int doctorAge;
     then in table make id as auto_increment 


  http://localhost:8080/add
  {
    "doctorId":1009,
     "doctorName": "rakesh kumar",
    "doctorAge": 34    
  }
 */
  
 




