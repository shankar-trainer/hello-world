package coforge.com.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;

@Configuration
@EnableWebSecurity
public class ApplicationSecutiryConfiguration extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	
	//UserBuilder builder=User.withDefaultPasswordEncoder();
	//auth.inMemoryAuthentication().withUser("ram").password("ram123").roles("ADMIN");
		UserDetails user = User. withDefaultPasswordEncoder()
				.username("user")
				.password("password")
				.roles("USER")
				
				
				.build();

		auth.inMemoryAuthentication().withUser(user);

	}
	
}
