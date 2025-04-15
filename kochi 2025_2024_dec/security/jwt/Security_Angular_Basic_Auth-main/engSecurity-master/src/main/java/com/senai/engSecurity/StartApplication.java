package com.senai.engSecurity;


import com.senai.engSecurity.model.User;
import com.senai.engSecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Component
public class StartApplication implements CommandLineRunner {

    @Autowired
    private UserRepository repository;

    @Transactional
    @Override
    public void run(String... args) throws Exception {
        // Criação do usuário admin
        createUserIfNotExists("admin", "ADMIN", "123", "ADMIN");

        // Criação do usuário user
        createUserIfNotExists("user", "USER", "123", "USER");
        repository.findAll().forEach(a->System.out.println(a));
    }

    private void createUserIfNotExists(String username, String name, String password, String role) {
        Optional<User> optionalUser = repository.findByUsername(username);

        if (optionalUser.isEmpty()) {
            User user = new User();
            user.setUsername(name);
            user.setUsername(username);
            user.setPassword(password);
            user.getRoles().add(role);
            repository.save(user);
            System.out.println("User added "+user);
        }
    }
}
