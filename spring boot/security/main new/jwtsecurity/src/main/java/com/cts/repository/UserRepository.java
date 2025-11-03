package com.cts.repository;

import com.cts.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User,Integer> {

    Optional<User> findByname(String name);

}
