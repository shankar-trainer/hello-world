package org.example.config;

import org.example.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by shankar on 4/11/2023.
 */

@Configuration
public class UserConfig {

    @Bean(value = "user1")
    public User getBean(){
       return  new User();
    }
}
