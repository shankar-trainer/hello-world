package com.amitpathak.medblocks.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(
            HttpSecurity http)
            throws Exception {

        http
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/")
                        .permitAll()
                        .anyRequest()
                        .authenticated())
                .oauth2Login(oauth ->
                        oauth.defaultSuccessUrl(
                                "/profile",
                                true))
                .logout(logout ->
                        logout.logoutSuccessUrl("/"));

        return http.build();
    }
}