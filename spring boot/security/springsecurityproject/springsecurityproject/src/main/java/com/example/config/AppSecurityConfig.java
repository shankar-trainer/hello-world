package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.server.SecurityWebFilterChain;

import java.util.ArrayList;

@Configuration
@EnableWebSecurity
public class AppSecurityConfig {

    // authentication
    @Bean
    public UserDetailsService userDetailsService(){
        //User user3=new User("user3","password3", new ArrayList<>());
        UserDetails user1 = User.withUsername("user1").password("password1").roles("USER").build();
        UserDetails user2 = User.withUsername("user2").password("password2").roles("ADMIN").build();

 //       InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager(user1,user2);

        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(user1);
        manager.createUser(user2);
        return manager;
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
                return NoOpPasswordEncoder.getInstance();
//        return new BCryptPasswordEncoder();
    }

    // authorization
    @Bean
    public SecurityFilterChain FilterChain(HttpSecurity  http) throws Exception {

        return http.authorizeHttpRequests(requests ->
                requests.
//                        requestMatchers("/welcome").hasRole("ADMIN").
                        requestMatchers("/welcome").hasAnyRole("USER","ADMIN").
                        requestMatchers("/greeting").hasRole("USER").
                        anyRequest().authenticated()).formLogin(Customizer.withDefaults()).build();
        // user1 -- user
        // user2 admin
// authenticated()).httpBasic()  -- popup form login
        //authenticated()).formLogin() form login
    }

}
