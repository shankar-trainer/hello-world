package com.abc.service;


import com.abc.model.User;
import com.abc.prinncipal.UserPrincipal;
import com.abc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService  implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> byUserName = userRepository.findByusername(username);
        if(byUserName.isEmpty())
            System.out.println("User Not present");
        return new UserPrincipal(byUserName.get());
    }
}
