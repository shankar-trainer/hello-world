package com.cts.service;

import com.cts.model.User;
import com.cts.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class UserService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       log.info("user "+username);
        Optional<User> byUserName = userRepository.findByname(username);
        if(byUserName.isEmpty())
            System.out.println("User Not present");
        return new UserPrincipal(byUserName.get());
    }
    public String addUser(User userInfo) {
        userInfo.setPassword(new BCryptPasswordEncoder(12).encode(userInfo.getPassword()));
        userRepository.save(userInfo);
        return "User Added Successfully";
    }

}
