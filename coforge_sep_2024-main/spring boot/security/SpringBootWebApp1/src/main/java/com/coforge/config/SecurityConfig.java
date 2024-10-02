package com.coforge.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public InMemoryUserDetailsManager inMemoryUserDetailsManager() {
        var userDetailsManager = User.builder().username("ram kumar").password("abcd").build();
        return new InMemoryUserDetailsManager(userDetailsManager);

    }
    @Bean
   public  PasswordEncoder getPasswordEncoder(){
       return NoOpPasswordEncoder.getInstance();
    }


}
