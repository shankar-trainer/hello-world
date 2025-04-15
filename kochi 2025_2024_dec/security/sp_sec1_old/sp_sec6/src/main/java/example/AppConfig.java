/*
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
public class AppConfig {
   // SecurityFilterChain with bean not working, below UserDetailsService commented
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//      http.httpBasic(Customizer.withDefaults());
        http.formLogin(Customizer.withDefaults());
        http.authorizeHttpRequests(c -> c.anyRequest().authenticated());
        UserDetails build = User.withUsername("ram").password("1234").authorities("admin").build();
        //InMemoryUserDetailsManager detailsManager = new InMemoryUserDetailsManager();
        //detailsManager.createUser(build);

        InMemoryUserDetailsManager detailsManager = new InMemoryUserDetailsManager(build);
        http.userDetailsService(detailsManager);
        return http.build();
    }

*/
/*    @Bean
    public UserDetailsService userDetails() {
        UserDetails build = User.withUsername("ram").password("1234").authorities("admin").build();
        InMemoryUserDetailsManager detailsManager = new InMemoryUserDetailsManager();
        detailsManager.createUser(build);
        return  detailsManager;
    }*//*


    @Bean
    PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }

}
*/
