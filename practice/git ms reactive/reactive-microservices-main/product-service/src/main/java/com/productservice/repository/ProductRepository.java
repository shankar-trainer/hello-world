package com.productservice.repository;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.productservice.entity.ProductEntity;

import reactor.core.publisher.Flux;

@Repository
public interface ProductRepository extends ReactiveMongoRepository<ProductEntity, String> {

	@Query("{ 'price' : { $gte: ?0, $lte: ?1 } }")
	public Flux<ProductEntity> findByPriceBetween(Double min, Double max);

}
