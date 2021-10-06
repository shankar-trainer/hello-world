package com.flight.repositories;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight.entities.User;

public interface UserRepository extends JpaRepository<User, BigInteger>{

}
