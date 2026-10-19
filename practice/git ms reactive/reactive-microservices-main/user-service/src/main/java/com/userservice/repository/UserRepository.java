package com.userservice.repository;

import org.springframework.data.r2dbc.repository.Modifying;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.userservice.entity.UserEntity;

import reactor.core.publisher.Mono;

@Repository
public interface UserRepository extends ReactiveCrudRepository<UserEntity, Integer> {

	@Modifying
	@Query("UPDATE users SET balance = balance - :amount WHERE id = :userId and balance >= :amount")
	Mono<Boolean> updateUserBalance(Integer userId, Double amount);

}
