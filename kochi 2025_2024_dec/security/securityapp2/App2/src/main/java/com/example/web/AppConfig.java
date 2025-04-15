package com.example.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class AppConfig {

    @Bean
//    public UserDetailsManager userDetailsService(){
    public UserDetailsService userDetailsService() {

        UserDetails user1 = User.withUsername("ram kumar").password("abcd").roles("user").build();
        UserDetails user2 = User.withUsername("amit kumar").password("wxyz").roles("write").build();

        //InMemoryUserDetailsManager detailsManager=new InMemoryUserDetailsManager(user1);
        InMemoryUserDetailsManager detailsManager = new InMemoryUserDetailsManager();
        detailsManager.createUser(user1);
        detailsManager.createUser(user2);
        return detailsManager;
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity security) throws Exception {
        security.httpBasic(Customizer.withDefaults());
        security.authorizeHttpRequests(c -> c.anyRequest().permitAll());
//        security.authorizeHttpRequests(c->c.anyRequest().authenticated());
        return security.build();
    }


    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }


}
