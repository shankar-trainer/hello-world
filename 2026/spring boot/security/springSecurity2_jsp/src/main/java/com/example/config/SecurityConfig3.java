/*
package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;


@Configuration
public class SecurityConfig3 {
    // https://bcrypt-generator.com/ ourpassword

    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails user = User.builder()
                .username("user")
                .password("$2a$12$90VHdRH4EVLEt79rSsvpfOzRphVjuCxbcCXYewsTAloO5wHcecTvy") // password ourpassword
                .build();
        return new InMemoryUserDetailsManager(user);
    }
// if no {bcrypt added then must use BCryptPasswordEncoder  }
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
*/
