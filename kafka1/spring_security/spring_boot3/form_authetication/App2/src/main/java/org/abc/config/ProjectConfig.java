package org.abc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectConfig {

    @Bean
    public UserDetailsService userDetailsServiceBean() throws Exception {
        var userDetailService = new InMemoryUserDetailsManager();
        var user = User.withUsername("ram kumar").password("abcd").authorities("read").build();
        userDetailService.createUser(user);
        return userDetailService;
    }

    @Bean
    public PasswordEncoder getPassordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }

    // form authentication
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http.csrf().disable()
                .authorizeHttpRequests()
                .requestMatchers("/auth/welcome").permitAll()
                .and()
                .authorizeHttpRequests().requestMatchers("/hello").authenticated()
                .and().formLogin()
                .and().build();
    }
}

//http://localhost:7070/hello
//http://localhost:7070/login
//http://localhost:7070/logout
//form authetication below
//https://www.geeksforgeeks.org/authentication-and-authorization-in-spring-boot-3-0-with-spring-security/
//basic authetication below

//https://www.baeldung.com/spring-security-basic-authentication
