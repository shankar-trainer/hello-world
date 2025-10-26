package com.example.service;

import com.example.dto.ProductDTO;
import com.example.feign.ProductFeign;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;

import java.util.List;

@Service
//@ComponentScan(value="com.example.feign")
public class ProductOrderService1 {

    @Autowired
    ProductFeign productFeign;

    public ResponseEntity<List<ProductDTO>> getAllProducts() {
        try {
            return productFeign.getAllProducts();
        } catch (Exception e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @CircuitBreaker(name = "PRODUCT", fallbackMethod = "fallbackUserData")
    public ResponseEntity<ProductDTO> getProductById(int id) {
            return productFeign.getProductById(id);

    }

    public  ResponseEntity<ProductDTO> fallbackUserData(Throwable t) {
        System.out.println("Fallback triggered for callExternalService: " + t.getMessage());
        return new ResponseEntity("Product service is not responding properly",HttpStatus.NOT_FOUND);
    }
}