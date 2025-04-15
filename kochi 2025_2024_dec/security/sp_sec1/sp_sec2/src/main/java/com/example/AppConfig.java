package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class AppConfig {

    @Bean
    public UserDetailsService userDetails(){
        //UserDetails ramKumar = User.withUsername("ram kumar").password("1234").build();
        UserDetails ramKumar = User.withUsername("ram kumar").password("1234").authorities("user").build();
        InMemoryUserDetailsManager detailsManager=new InMemoryUserDetailsManager();
        detailsManager.createUser(ramKumar);
        return  detailsManager;
    }

    @Bean
    PasswordEncoder passwordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }

}
