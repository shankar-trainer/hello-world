package com.cts.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class AppConfig {

    @Bean
    public UserDetailsService userDetails() {

//        UserDetails details1 = User.withUsername("ram kumar").password("abcd").authorities("ROLE_USER").build();
        UserDetails details1 = User.withUsername("ram kumar").password("abcd").roles("user").build();
//        UserDetails details2 = User.withUsername("shyam kumar").password("abcd").authorities("ROLE_ADMIN").build();
        UserDetails details2 = User.withUsername("shyam kumar").password("abcd").roles("admin").build();

//        InMemoryUserDetailsManager detailsManager = new InMemoryUserDetailsManager(details1, details2);
        InMemoryUserDetailsManager detailsManager = new InMemoryUserDetailsManager();
        detailsManager.createUser(details1);
        detailsManager.createUser(details2);
        return detailsManager;
    }


    @Bean
    public PasswordEncoder encoder() {
        return NoOpPasswordEncoder.getInstance();
    }


    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
//        httpSecurity.formLogin(Customizer.withDefaults())
        httpSecurity.formLogin(Customizer.withDefaults()).authorizeHttpRequests(authorizationManagerRequestMatcherRegistry ->
                authorizationManagerRequestMatcherRegistry.
                        requestMatchers("/office").hasRole("admin").
                        requestMatchers("/home").hasRole("user").
                        anyRequest().authenticated());

        return httpSecurity.build();
    }

}
