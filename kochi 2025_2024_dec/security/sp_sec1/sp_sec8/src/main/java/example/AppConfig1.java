package example;

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
public class AppConfig1 {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.formLogin(Customizer.withDefaults());
        //http.authorizeHttpRequests(a->a.anyRequest().hasRole("admin"));
        http.authorizeHttpRequests(
                //c->c.requestMatchers("/hello").hasRole("admin").anyRequest().permitAll());
                c -> c.requestMatchers("/hello").hasRole("admin").
                        requestMatchers("/test").hasRole("manager")
                        .anyRequest()
                        .authenticated());
        return http.build();
    }
/*

    @Bean
    public UserDetailsService userDetails() {
        var manager = new InMemoryUserDetailsManager();
        var user1 = User.withUsername("ram kumar").password("abc").roles("admin").build();
        var user2 = User.withUsername("amit kumar").password("abc").roles("manager").build();
        manager.createUser(user1);
        manager.createUser(user2);
        return manager;
    }
*/

    @Bean
    public UserDetailsService userDetails1() {
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        UserDetails user1 = User.withUsername("ram kumar").password("abc").roles("admin").build();
        UserDetails user2 = User.withUsername("amit kumar").password("abc").roles("manager").build();
        manager.createUser(user1);
        manager.createUser(user2);
        return manager;
    }

    @Bean
    PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }

}
