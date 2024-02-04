package com.se.alaf.security.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.se.alaf.security.model.RoleA;
import com.se.alaf.security.model.UserA;
import com.se.alaf.security.repository.UserRepository;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@AllArgsConstructor
@Slf4j
public class UserService implements UserDetailsService {

	private final UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		UserA user = StreamSupport.stream(userRepository.findAll().spliterator(), false)
				.peek(s -> {
					List<RoleA> roles = s.getRoleList();
					// concat all roles as a string 
					String str = roles.stream().map(RoleA::getName).reduce("", String::concat);
					log.info("UserA: {} - {} - {}", s.getUsername(), s.getPassword(), str);
				})
				.filter(s -> s.getUsername().equals(username)).findFirst().get(); 
	 
		// concat them as a string with "," as delimiter
		String str = user.getRoleList().stream().map(RoleA::getName).collect(Collectors.joining(","));
		
		String authorities[] = str.split(",");
		
		UserDetails userDetail = User.withUsername(user.getUsername()).password(user.getPassword()).roles(authorities).build();
				
		log.info("UserDetails: {}", userDetail);
		return userDetail;
	}

}
