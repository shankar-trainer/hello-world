package com.example.config;

import com.example.model.User;
import com.example.service.InmemmoryUseDetailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.User;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.server.SecurityWebFilterChain;

import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    public UserDetailsService userDetailsService() {
//        UserDetails user1 = User.withUsername("ram kumar").password("abcd").roles("user").build();
        UserDetails user2 = new User("kamal kumar", "kamal", "ROLE_USER","user");
//       return  new InMemoryUserDetailsManager(List.of(user1));
        return new InmemmoryUseDetailService(List.of(user2));
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
        return NoOpPasswordEncoder.getInstance();
    }
    // below not working , comment then working

    @Bean
    public SecurityFilterChain securityWebFilterChain(HttpSecurity http) throws Exception {
        return http.formLogin(Customizer.withDefaults()).authorizeHttpRequests(a -> a.requestMatchers("/hello").hasRole("user").anyRequest().authenticated()).build();

//      return http.formLogin(Customizer.withDefaults()).authorizeHttpRequests(a -> a.requestMatchers("/hello").hasRole("user").anyRequest().permitAll()).build();

    }
}
