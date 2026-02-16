package com.example.service;

import com.example.UserRepository;
import com.example.model.User;
import com.example.principal.UserPrincipal;
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
public class UserService  implements UserDetailsService {
 @Autowired
private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> byname = userRepository.findByname(username);
        if(byname.isEmpty())
          log.error("user name is empty");

            return new UserPrincipal(byname.get());
    }
    public String addUser(User user){
        user.setPassword(new BCryptPasswordEncoder(12).encode(user.getPassword()));
        userRepository.save(user);
        return "user added"+user;
    }
}
