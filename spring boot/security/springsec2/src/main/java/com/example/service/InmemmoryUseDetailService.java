package com.example.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;


public class InmemmoryUseDetailService implements UserDetailsService {

    private final List<UserDetails> users;

    public InmemmoryUseDetailService(List<UserDetails> users) {
        this.users = users;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return users.stream().filter(a->a.getUsername().equals(username)).findFirst().orElseThrow(() -> new UsernameNotFoundException("Username not found"));
    }
}
