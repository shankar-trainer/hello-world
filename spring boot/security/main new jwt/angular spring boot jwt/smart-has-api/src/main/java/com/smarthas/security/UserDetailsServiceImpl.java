package com.smarthas.security;

import com.smarthas.model.UserAccount;
import com.smarthas.repository.UserAccountRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import
        org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    private final UserAccountRepository repository;

    public UserDetailsServiceImpl(UserAccountRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws
            UsernameNotFoundException {
        UserAccount ua = repository.findByUsername(username)
                .orElseThrow(() -> new
                        UsernameNotFoundException("Usuário não encontrado"));
        Set<GrantedAuthority> authorities = ua.getRoles().stream()
                .map(r -> new SimpleGrantedAuthority(r.name()))
                .collect(Collectors.toSet());
        return new User(ua.getUsername(), ua.getPassword(), authorities);
    }
}