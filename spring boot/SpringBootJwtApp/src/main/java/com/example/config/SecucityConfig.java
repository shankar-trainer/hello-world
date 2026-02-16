package com.example.config;

import com.example.filter.AuthFilter;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration

public class SecucityConfig {

    @Autowired
    private AuthFilter authFilter;

    @Autowired
    private UserService userService;

    @Bean
    public AuthenticationProvider authenticationProvider(){
        DaoAuthenticationProvider provider=new DaoAuthenticationProvider(userService);

        provider.setPasswordEncoder(new BCryptPasswordEncoder(12));
        return  provider;
    }
    @Bean
    public AuthenticationManager authenticationManager
            (AuthenticationConfiguration configuration) throws Exception {

        return  configuration.getAuthenticationManager();
    }
    @Bean public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf(c->c.disable()).authorizeHttpRequests
                (req-> req.requestMatchers("/addNewUser","/generateToken").permitAll()).
                authorizeHttpRequests(req->req.requestMatchers("/welcome").authenticated()).authorizeHttpRequests(req->req.anyRequest().authenticated()).httpBasic(Customizer.withDefaults()).sessionManagement(ses->ses.sessionCreationPolicy(SessionCreationPolicy.STATELESS)).authenticationProvider(authenticationProvider()).addFilterBefore(authFilter, UsernamePasswordAuthenticationFilter.class);

     return  http.build();
    }
}
