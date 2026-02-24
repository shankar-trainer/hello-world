package com.example.service;

import com.example.model.Product;
import com.example.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
//@ComponentScan(basePackages = "com.example.repository")
public class ProductService {

    @Autowired
    private ProductRepository repository;

//    public ProductService(ProductRepository repository) {
//        this.repository = repository;
//    }

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
