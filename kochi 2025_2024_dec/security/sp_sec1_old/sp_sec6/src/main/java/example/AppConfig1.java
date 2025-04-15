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
//      http.httpBasic(Customizer.withDefaults());
        http.formLogin(Customizer.withDefaults());
      //  http.authorizeHttpRequests(c -> c.anyRequest().permitAll());// will allow all without any username
      //  http.authorizeHttpRequests(c -> c.anyRequest().authenticated());
        http.authorizeHttpRequests(c -> c.anyRequest().hasAuthority("read"));// allow user4
        return http.build();
    }

    @Bean
    public UserDetailsService userDetails() {
        UserDetails user1 = User.withUsername("ram1").password("1234").authorities("admin").build();
        UserDetails user2 = User.withUsername("ram2").password("1234").authorities("user").build();
        UserDetails user3 = User.withUsername("ram3").password("1234").authorities("write").build();
        UserDetails user4 = User.withUsername("ram4").password("1234").authorities("read").build();
        InMemoryUserDetailsManager detailsManager = new InMemoryUserDetailsManager();
        detailsManager.createUser(user1);
        detailsManager.createUser(user2);
        detailsManager.createUser(user3);
        detailsManager.createUser(user4);
        return  detailsManager;
    }

    @Bean
    PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }

}
