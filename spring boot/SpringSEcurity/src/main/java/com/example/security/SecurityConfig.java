package com.example.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@EnableWebSecurity
@Configuration
public class SecurityConfig {

    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails userDetails1 = User.withDefaultPasswordEncoder().username("suresh").roles("admin").password("xyz").build();
        UserDetails userDetails2 = User.withDefaultPasswordEncoder().username("ganesh").password("123").build();

//        return  new InMemoryUserDetailsManager(userDetails1);
        return new InMemoryUserDetailsManager(userDetails1, userDetails2);
    }

    @Bean
    SecurityFilterChain securityFilterChain1(HttpSecurity http){
        http
                .authorizeHttpRequests(authz -> authz
                        // Allow  for /login
                        .requestMatchers("/welcome").permitAll()
                        // Deny all access to /greeting
                        .requestMatchers("/greeting").denyAll()
                        // Allow only ADMIN role for /login
                        .requestMatchers("/login").hasRole("ADMIN")
                        // All other requests require authentication
                        .anyRequest().authenticated()
                )
                .formLogin(withDefaults());

        return http.build();

    }

    // below permit all to /hello no role, no form  to be given

/*    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) {
        http.authorizeHttpRequests(authorize -> authorize.requestMatchers("/hello").permitAll().anyRequest().permitAll());
        return http.build();
    }*/
/*
    // below user with /hello and  role admin to be authenticated, post method not work
    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) {
        http.authorizeHttpRequests(authorize -> authorize.requestMatchers("/hello").
                hasRole("admin").anyRequest().denyAll()).httpBasic(Customizer.withDefaults());
        return http.build();
    }*/

/*
     below user with /hello and  role admin to be authenticated, post method  work by enabling csrf
        http.csrf(Customizer.withDefaults()).  default enabled csrf
      http.csrf(c->c.disable()).  disables csrf
*/

/*    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) {
        http.csrf(c -> c.disable()).authorizeHttpRequests(authorize -> authorize.requestMatchers("/hello").hasRole("admin").anyRequest().authenticated()).httpBasic(Customizer.withDefaults());
        return http.build();
    }*/
/*
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/hello").hasRole("ADMIN") // Only ADMIN can access /hello
                        .anyRequest().authenticated()               // All other requests require authentication
                )
                //.formLogin(Customizer.withDefaults())   // Enable form login
                //.and()
                .httpBasic(Customizer.withDefaults());  // Enable basic authentication

        return http.build();
    }
    */

    //spring security with two end point hello and welcome  both authenticated

    // @Bean
    // public SecurityFilterChain securityFilterChain1(HttpSecurity http) throws Exception {
    //     http
    //             .authorizeHttpRequests(auth -> auth
    //                     .anyRequest().authenticated() // Locks down both /hello and /welcome
    //             )
    //             // formLogin provides the standard browser login UI
    //             .formLogin(Customizer.withDefaults())
    //             // httpBasic allows for easy testing via Postman or curl
    //             .httpBasic(Customizer.withDefaults());
    //
    //     return http.build();
    // }

}
