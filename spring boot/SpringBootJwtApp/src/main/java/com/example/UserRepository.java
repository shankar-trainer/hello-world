package com.example;

import com.example.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository
        <User,Integer> {

  Optional<User> findByname(String name);

}
