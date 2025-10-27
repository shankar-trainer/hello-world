package com.example.service;

import com.example.exception.ProductException;
import com.example.repository.ProductRepository;
import com.example.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product addProduct(Product product) {

//               if(productRepository.findById(product.getProductId()).isEmpty())
//                   throw new ProductException("Product not found");
//               else

               return  productRepository.save(product);
    }

    public Product getProductById(int productId) {
        if(productRepository.findById(productId).isPresent())
            return productRepository.findById(productId).get();
        else
            throw new ProductException("Product not found");
    }
    public List<Product> getAllProducts() {
        if(productRepository.findAll().isEmpty())
            throw new ProductException("Product not found");
        else
            return productRepository.findAll();
    }

}
