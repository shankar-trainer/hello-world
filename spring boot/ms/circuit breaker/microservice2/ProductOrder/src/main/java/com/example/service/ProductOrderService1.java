package com.example.service;

import com.example.dto.ProductDTO;
import com.example.exception.ProductOrderException;
import com.example.feign.ProductFeign;
import com.example.model.ProductOrder;
import com.example.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;

import java.util.List;

@Service
public class ProductOrderService1 {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    ProductFeign productFeign;

    public ResponseEntity<ProductOrder> addProduct(ProductOrder productOrder) {
        try {
            ResponseEntity<ProductDTO> dto = productFeign.getProductById(productOrder.getProductId());
            if (dto.getStatusCode().is2xxSuccessful())
                return new ResponseEntity<>(productRepository.save(productOrder), HttpStatus.OK);
            else
                throw new ProductOrderException("product id not present in product table");
        } catch (RuntimeException e) {
            return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<List<ProductDTO>> getAllProducts() {
        try {
            return productFeign.getAllProducts();
        }
        catch (Exception e) {
            return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<ProductDTO> getProductById(int id) {
        try {
            return productFeign.getProductById(id);
        } catch (RestClientException e) {
            return new ResponseEntity("product id not present in product table", HttpStatus.NOT_FOUND);
        }
        catch (Exception e) {
            return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
        }
    }

    }