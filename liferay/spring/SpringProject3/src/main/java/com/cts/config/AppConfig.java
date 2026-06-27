package com.cts.config;

import com.cts.model.Address;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "com.cts.model")
public class AppConfig {

    @Bean
    public Address address(){
        return  new Address();
    }

}
