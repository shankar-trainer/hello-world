package com.example.service;

import com.example.model.Product;
import com.example.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;
/*
    public Page<Product> getallProduct(int page, int size, Sort sortBy) {
        PageRequest pageRequest = PageRequest.of(page, size, sortBy);
        return productRepository.findAll(pageRequest);
    }*/

    public Page<Product> getallProduct1(Pageable pageable) {
        return productRepository.findAll(pageable);
    }


    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

}
