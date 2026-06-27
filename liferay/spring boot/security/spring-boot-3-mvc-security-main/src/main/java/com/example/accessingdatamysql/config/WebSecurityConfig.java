package com.example.accessingdatamysql.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

    // Note: This is the password persteen1967 bcrypted
    private String ENCODED_PASSWORD = "$2a$10$BU4mPFHW8stXWMVH8clcZ.yZ7wl54oJq.f0Lu2HnUK6.WdooEoTZ2";

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public UserDetailsService userDetailsService(PasswordEncoder encoder) {

        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();

        manager.createUser(User.withUsername("user")

                // Note: The User will be granted by typing persteen1967 in the login form because
                // here the password persteen1967 is already coded by bcrypt and match
                //.password(ENCODED_PASSWORD)

                // Note: The User will be granted by typing persteen1967 in the login form because
                // here the password persteen1967 will be coded by bcrypt below and match
                .password(encoder.encode("persteen1967"))

                .roles("USER")
                .build());

        manager.createUser(User.withUsername("admin")

                // Note: The User will be granted by typing persteen1967 in the login form because
                // here the password persteen1967 is already coded by bcrypt and match
                .password(ENCODED_PASSWORD)

                // Note: The User will be granted by typing persteen1967 in the login form because
                // here the password persteen1967 will be coded by bcrypt below and match
                //.password(encoder.encode("persteen1967"))

                .roles("USER", "ADMIN")
                .build());
        return manager;
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                // Note: This is needed form the costum login form to work !!!
                .csrf(csrf -> csrf.disable())
                .authorizeHttpRequests((requests) -> requests
                        .requestMatchers("/",

                                "/demo/mvclistpersons/**",
                                // "/demo/mvcdeleteperson/**",
                                // "/demo/mvcupdateperson/**",
                                // "/demo/mvccreateperson",
                                "/WEB-INF/**",
                                "/hello",
                                "/home",
                                "/welcome",
                                "/bcrypt").permitAll()

                        .anyRequest().authenticated()
                )
                .formLogin((form) -> form

                        // Disable this to use the Default Spring Security Login Page
                        .loginPage("/login")
                        .defaultSuccessUrl("/")
                        .failureUrl("/login?error=true")
                        .permitAll()
                )
                .logout((logout) -> logout.permitAll()
                );

        return http.build();
    }
}
