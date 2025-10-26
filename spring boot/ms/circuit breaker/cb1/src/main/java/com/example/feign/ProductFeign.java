package com.example.feign;

import com.example.dto.ProductDTO;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

//@FeignClient(url = "http://localhost:8080/product/", value = "PRODUCT")
@FeignClient(name = "PRODUCT", url = "http://localhost:8080/product/")
public interface ProductFeign {

    //    @CircuitBreaker(name = "userService", fallbackMethod = "fallbackUserData")
    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> getProductById(@PathVariable("id") int productId) ;

    @GetMapping
    public ResponseEntity<List<ProductDTO>> getAllProducts();

}
