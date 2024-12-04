package com.abc.spring.auth.example;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.jaas.memory.InMemoryConfiguration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig{
@Bean
public UserDetailsService getUserDetail() {
	InMemoryUserDetailsManager userDetail = new InMemoryUserDetailsManager();
	UserDetails user = User.withUsername("ramkumar").password("abcdef").authorities("USER").build();

	userDetail.createUser(user);
	return userDetail;
}

@Bean
public PasswordEncoder getEncoder() {
	return NoOpPasswordEncoder.getInstance();
}


@Bean
public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
	http.csrf(AbstractHttpConfigurer::disable)
			.cors(Customizer.withDefaults())
			.authorizeHttpRequests(authorizationManagerRequestMatcherRegistry -> authorizationManagerRequestMatcherRegistry
					.requestMatchers(HttpMethod.OPTIONS, "/**").fullyAuthenticated()
					//.requestMatchers("/allPerson").permitAll()
					.anyRequest().authenticated())
			.httpBasic(Customizer.withDefaults());
	return http.build();
 }
}
