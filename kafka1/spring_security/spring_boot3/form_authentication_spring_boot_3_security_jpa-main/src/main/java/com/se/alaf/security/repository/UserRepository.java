package com.se.alaf.security.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.se.alaf.security.model.UserA;

@Repository
public interface UserRepository extends CrudRepository<UserA, Integer>  {
	
	
	/*
	public class UserRepository {
	PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	
	UserDetails alaf = User.builder().username("alaf").password(passwordEncoder.encode("password"))
			.authorities("staff", "admin").build();

	UserDetails staff = User.builder().username("staff").password(passwordEncoder.encode("password"))
			.authorities("staff").build();
	
	List<UserDetails> users = Arrays.asList(alaf, staff);

	
	public UserDetails findByUsername(String username) {
				return users.stream().filter( u -> u.getUsername().equalsIgnoreCase(username)).
				collect(Collectors.toList()).get(0);
		
		
	};*/

}
