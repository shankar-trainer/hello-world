package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.model.User;
@Repository
public interface UserRepository  extends MongoRepository<User,Integer>{
    

}
