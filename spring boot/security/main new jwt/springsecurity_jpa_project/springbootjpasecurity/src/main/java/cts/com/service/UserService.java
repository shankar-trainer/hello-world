package cts.com.service;

import cts.com.model.User;
import cts.com.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.security.Principal;

@Service
public class UserService  implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User byUsername = userRepository.findByname(username);
        if(byUsername == null){
            throw new UsernameNotFoundException("Username not found");
        }
        return  new UserPrincipal(byUsername);
        //return  byUsername;
    }
}
