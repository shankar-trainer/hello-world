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
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class AppConfig {


    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }

    @Bean
    public SecurityFilterChain configure(HttpSecurity http) throws Exception {
        //var user = User.withUsername("ram kumar").password("abcd").authorities("read").build();
        var user = User.withUsername("ram kumar").password("abcd").authorities("ROLE_USER").build();
        InMemoryUserDetailsManager inMemoryUserDetailsManager = new InMemoryUserDetailsManager(user);

       // http.httpBasic(Customizer.withDefaults());
        http.formLogin(Customizer.withDefaults());
        http.authorizeHttpRequests(c -> c.anyRequest().authenticated());
        http.userDetailsService(inMemoryUserDetailsManager);

        return http.build();
    }

/*    @Bean
    public SecurityFilterChain configure1(HttpSecurity http) throws Exception {
        //var user = User.withUsername("ram kumar").password("abcd").authorities("read").build();
        //var user = User.withUsername("ram kumar").password("abcd").authorities("ROLE_USER").build();
        //var inMemoryUserDetailsManager = new InMemoryUserDetailsManager(user);

        User.UserBuilder userBuilder=User.withUsername("ram kumar");

        UserDetails userDetails= userBuilder.password("abcd").authorities("read","write").passwordEncoder(p-> passwordEncoder().encode(p)).build();
        var inMemoryUserDetailsManager = new InMemoryUserDetailsManager(user);

        // http.httpBasic(Customizer.withDefaults());
        http.formLogin(Customizer.withDefaults());
        http.authorizeHttpRequests(c -> c.anyRequest().authenticated());
        http.userDetailsService(inMemoryUserDetailsManager);

        return http.build();
    }*/

}
