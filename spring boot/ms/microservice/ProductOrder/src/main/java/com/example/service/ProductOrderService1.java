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
import org.springframework.web.client.RestTemplate;

@Service
public class ProductOrderService1 {

    @Autowired
    private ProductFeign productFeign;
    @Autowired
    private ProductRepository productRepository;
//    @Autowired
//    RestTemplate restTemplate;

    public  ResponseEntity<ProductOrder> addProduct(ProductOrder productOrder) {

        try {
            ResponseEntity<ProductDTO> product = productFeign.getProductById(productOrder.getProductId());
            if (product.getStatusCode().is2xxSuccessful()) {
                return new ResponseEntity<>(productRepository.save(productOrder), HttpStatus.OK);
            }
            else
                throw new ProductOrderException("product id not present in product table");
        } catch (RestClientException e) {
            return new ResponseEntity("product id not present in product table", HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }

    }
}
