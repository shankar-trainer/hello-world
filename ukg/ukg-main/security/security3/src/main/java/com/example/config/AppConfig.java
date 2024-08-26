package com.example.config;

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
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

@Configuration
public class AppConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }

    @Bean
    SecurityFilterChain getSecurityFilterChain(HttpSecurity http) throws Exception{
//        http.httpBasic(Customizer.withDefaults()).authorizeHttpRequests(c->c.anyRequest().authenticated());
        http.formLogin(Customizer.withDefaults()).authorizeHttpRequests(c->c.anyRequest().authenticated());
        var user=User.withUsername("ram").password("shyam").authorities("read").build();

        http.userDetailsService(new InMemoryUserDetailsManager(user));
       return  http.build();
    }

/*
    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        UserDetails userDetails = User.withUsername("ram").password("abcd").build();
        User.UserBuilder userBuilder = User.withUsername("ram").password("abcd").authorities("read");
        UserDetails build = userBuilder.build();

        //return  httpSecurity.httpBasic(Customizer.withDefaults()).build();

        return httpSecurity.userDetailsService(new InMemoryUserDetailsManager(build)).build();
    }
*/

    /*@Bean
    public UserDetailsService getUserDetailsService(){
        var user=User.withUsername("ram").password("abcd").authorities("read","write").build();
        return  new InMemoryUserDetailsManager(user);
    }
    */

/*    @Bean
    public UserDetailsService userDetailsService(DataSource dataSource){
        UserDetails userDetails=User.withUsername("pkumar").password("abc").authorities("read").build();
        return  new InMemoryUserDetailsManager(userDetails);
    }*/
    
/*
    @Bean
    public UserDetailsService userDetailsService(DataSource dataSource){
        JdbcUserDetailsManager jdbcUserDetailsManager = new JdbcUserDetailsManager(dataSource);
        jdbcUserDetailsManager.setUsersByUsernameQuery("");
    }
*/
}