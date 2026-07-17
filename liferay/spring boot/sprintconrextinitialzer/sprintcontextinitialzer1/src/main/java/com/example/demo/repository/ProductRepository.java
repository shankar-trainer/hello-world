package com.example.demo.repository;

import com.example.demo.model.Product;
import org.springframework.stereotype.Repository;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class ProductRepository {
    private final Map<String, Product> db = new ConcurrentHashMap<>();

    public Product save(Product product) {
        db.put(product.getId(), product);
        return product;
    }

    public Optional<Product> findById(String id) {
        return Optional.ofNullable(db.get(id));
    }

    public Map<String, Product> findAll() {
        return db;
    }

    public void deleteById(String id) {
        db.remove(id);
    }
}