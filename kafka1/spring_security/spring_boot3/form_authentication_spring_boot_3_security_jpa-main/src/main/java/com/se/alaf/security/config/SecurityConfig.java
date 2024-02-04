package com.se.alaf.security.config;

import java.io.IOException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.se.alaf.security.service.UserService;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Configuration
@EnableWebSecurity
@AllArgsConstructor
@Slf4j
public class SecurityConfig {
	// private final UserDetailsService userService;
	private final UserService userService;

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

		http.formLogin(Customizer.withDefaults())
				.authorizeHttpRequests(req -> req
						.requestMatchers(AntPathRequestMatcher.antMatcher("/h2-console/**"),
								AntPathRequestMatcher.antMatcher("/greet/**")).permitAll()
						.requestMatchers("/admin/**").hasAnyAuthority("ROLE_admin") 
						.requestMatchers("/staff/**").hasAnyAuthority("ROLE_admin", "ROLE_staff")
						.anyRequest()
						.authenticated())
				.userDetailsService(userService);
		// h2-console
		http.csrf(csrf -> csrf.ignoringRequestMatchers(AntPathRequestMatcher.antMatcher("/h2-console/**")).disable());
		http.headers().frameOptions().disable();
		
		http.logout(logout -> logout.logoutSuccessUrl("/").logoutSuccessHandler(new LogoutSuccessHandler() {
			@Override
			public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response,
					Authentication authentication) throws IOException, ServletException {
				UserDetails userDetails = (UserDetails) authentication.getPrincipal();
				String username = userDetails.getUsername();

				log.info("The user { } has logged out!", username );

				response.sendRedirect(request.getContextPath());
			}
		}).invalidateHttpSession(true).clearAuthentication(true));
		return http.build();
	}

	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder(); // använd detta för prod.
		// return NoOpPasswordEncoder.getInstance(); //för dev
	}
}
