package com.cofoge.repository;

import com.cofoge.model.Customer;
import com.cofoge.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends
        JpaRepository
        <User,Integer> {
}

