package com.example.repository;

import com.example.model.CustomUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<CustomUser, Long> {
    Optional<CustomUser> findByUsername(String username);
}
