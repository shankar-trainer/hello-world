package io.abc.app;

import io.abc.app.entity.User;
import io.abc.app.enumeration.Role;
import io.abc.app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class SpringBoot3JwtApplication  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot3JwtApplication.class, args);

	}

	@Autowired
	 UserRepository repository;
	@Autowired
	PasswordEncoder passwordEncoder;
	@Override
	public void run(String... args) throws Exception {
		var user = User.builder()
				.firstName("mohan")
				.lastName("kumar")
				.email("mohan@gmail.com")
				.password(passwordEncoder.encode("1234"))
				.role(Role.USER)
				.build();
		repository.save(user);
	}
}
