package com.cofoge.repository;

import com.cofoge.model.Person;
import com.cofoge.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends
        JpaRepository
        <Person,Integer> {
}

