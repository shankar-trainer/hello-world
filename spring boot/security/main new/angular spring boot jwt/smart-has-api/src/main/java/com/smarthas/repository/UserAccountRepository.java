package com.smarthas.repository;

import com.smarthas.model.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserAccountRepository extends JpaRepository<UserAccount,
        Long> {
    Optional<UserAccount> findByUsername(String username);

    boolean existsByUsername(String username);
}