package com.example.web;

import com.example.entity.Product;
import com.example.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class ProductController {
    @Autowired
    private ProductRepository repository;

    /*@PostMapping
    public Mono<Product> addProduct(@RequestBody Product product){
       return repository.save(product);
    }
    */

/*    @PostMapping
    public ResponseEntity<Mono<Product>> addProduct(@RequestBody Product product){
       return new ResponseEntity<>(repository.save(product), HttpStatus.CREATED);
    }*/

    @PostMapping
    public Mono<ResponseEntity<Product>> addProduct(@RequestBody Product product) {

        return repository.save(product).map(prd->ResponseEntity.status(HttpStatus.CREATED).body(prd));

    }


    @GetMapping
    public Flux<ResponseEntity<Product>> getAllProduct() {
        return repository.findAll().map(product -> ResponseEntity.ok(product)); // Map each Product to a ResponseEntity
    }

//    @GetMapping
//    public Flux<Product> getAllProduct() {
//        return repository.findAll();
//    }


    @GetMapping("/{id}")
    public Mono<ResponseEntity<Product>> findProductById(@PathVariable String id) {
        return repository.findById(id).map(prd -> ResponseEntity.ok(prd)).defaultIfEmpty(ResponseEntity.notFound().build());

    }

}
