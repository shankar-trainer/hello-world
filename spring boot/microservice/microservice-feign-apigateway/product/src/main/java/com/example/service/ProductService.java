package com.example.service;

import com.example.model.Product;
import com.example.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public Product addProduct(Product product) {
        return repository.save(product);
    }

    public List<Product> getAllProduct() {
        if (repository.findAll().isEmpty())
            throw new IllegalArgumentException("list is empty");
        return repository.findAll();
    }

    public Product searchById(int id) {
        Optional<Product> byId = repository.findById(id);
        if (byId.isEmpty())
            throw new IllegalArgumentException("product not found with id " + id);
        else
            return byId.get();
    }
}
