package com.example.repository;

import com.example.entity.Product;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductRepository  extends ReactiveMongoRepository<Product,String> {

}
