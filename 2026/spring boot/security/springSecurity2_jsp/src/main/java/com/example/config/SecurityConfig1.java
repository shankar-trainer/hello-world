/*package com.example.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;


@Configuration
public class SecurityConfig1 {

        @Bean
        public UserDetailsService userDetailsService() {
            UserDetails user = User.builder()
                    .username("user")
                    .password("{noop}ourpassword") // password ourpassword
                    .build();
            return new InMemoryUserDetailsManager(user);
            //if no encoder then add noop, pass is ourpassword
        }
}*/
/*
{noop} actually do?
By default, modern Spring Security refuses to store or compare passwords in plain, clear text for security reasons. It expects passwords to be hashed (like bcrypt or argon2).
 */