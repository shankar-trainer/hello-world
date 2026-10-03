package com.userservice.repository;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.userservice.entity.TransactionEntity;

import reactor.core.publisher.Flux;

@Repository
public interface TransactionRepository extends ReactiveCrudRepository<TransactionEntity, Integer> {

	@Query("SELECT * FROM transactions WHERE user_id = :userId")
	Flux<TransactionEntity> findAllByUserId(Integer userId);

}
