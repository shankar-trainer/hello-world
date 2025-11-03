package com.example.service;

import com.example.dto.ProductDTO;
import com.example.exception.ProductOrderException;
import com.example.feign.ProductFeign;
import com.example.model.ProductOrder;
import com.example.repository.ProductOrderRepository;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
// @ComponentScan(basePackages = { "com.example.repository"})
public class ProductOrderService1 {

    @Autowired
    private ProductFeign productFeign;
    @Autowired
    private ProductOrderRepository productRepository;

    public ResponseEntity<List<ProductOrder>> getAllProductOrder() {
        return new ResponseEntity<>(productRepository.findAll(), HttpStatus.OK);
    }

    //
    public ResponseEntity<ProductDTO> getProudctByProductOrderId(int prdid) {
        ProductOrder productOrder = productRepository.findById(prdid).get();
        return new ResponseEntity(productFeign.getProductById(productOrder.getProductId()),HttpStatus.OK);
    }

    @CircuitBreaker(name = "PRODUCT", fallbackMethod =
            "fallbackProductData")

    public ResponseEntity<ProductDTO> getProductById(int id) {
        return productFeign.getProductById(id);
    }

    public ResponseEntity<ProductDTO>
    fallbackProductData(Throwable t) {
        System.out.println("Fallback triggered fo       callExternalService: " + t.getMessage());
        return new ResponseEntity("Product service is not            responding properly",HttpStatus.NOT_FOUND);
    }
    public ResponseEntity<ProductOrder> addProduct(ProductOrder productOrder) {
        try {
            ResponseEntity<ProductDTO> product = productFeign.getProductById(productOrder.getProductId());// product is available
            if (product.getStatusCode().is2xxSuccessful()) {
                return new ResponseEntity<>(productRepository.save(productOrder), HttpStatus.OK);   // then save product order
            } else
                throw new ProductOrderException("product id not present in product table");
        } catch (RestClientException e) {
            return new ResponseEntity("product id not present in product table", HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

}
