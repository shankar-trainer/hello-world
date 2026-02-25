package com.example.web;

import com.example.model.Product;
import com.example.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ProductController {

    private ProductRepository productRepository;

    @GetMapping("/page")
    public Page<Product> getallProduct1(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    @PostMapping("/page")
    public Product addProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }
}

//http://localhost:8080/page?page=0&size=10
//http://localhost:8080/page?page=1&size=10&sort=name
