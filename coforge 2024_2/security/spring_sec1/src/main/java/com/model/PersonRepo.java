package com.model;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PersonRepo extends JpaRepository<Person,Integer> {
    Optional<Person> findByName(String username);
}