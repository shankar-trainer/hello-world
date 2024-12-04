package com.example;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ManagerRepo extends JpaRepository<Manager,Integer> {
    Optional<Manager> findByName(String username);
}