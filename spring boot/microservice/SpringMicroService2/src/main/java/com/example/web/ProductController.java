package com.example.web;

import com.example.model.Product;
import com.example.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping("/product")
    public ResponseEntity<List<?>> getAllProduct() {
        if (productRepository.findAll().isEmpty()) {
            return new ResponseEntity("product list is empty", HttpStatus.NOT_FOUND);
            //return  ResponseEntity.status(HttpStatus.NOT_FOUND).body("product list is empty");
        } else {
            System.out.println("product find all called ..");
            return ResponseEntity.status(HttpStatus.FOUND).
                    body(productRepository.findAll());
        }
    }

    @PostMapping("/product")
    public ResponseEntity<?> addProduct(@RequestBody Product prd) {
        Optional<Product> byId = productRepository.findById(prd.getProductId());
        if (byId.isEmpty()) {
            return ResponseEntity.status(HttpStatus.CREATED).
                    body(productRepository.save(prd));
        } else
            //    return  new ResponseEntity<>("product id already present",HttpStatus.NOT_FOUND);
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("product id already present");
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<?> searchProductById(@PathVariable("id") int id) {
        if (productRepository.findById(id).isPresent())
            return ResponseEntity.status(HttpStatus.FOUND).body(productRepository.findById(id).get());
        else
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("not found");
    }

    //@GetMapping("/product/{name}")
    @GetMapping("/product1/{name}")
    //public ResponseEntity<?> searchProductByName(@PathVariable("name")  String name) {
    public ResponseEntity<?> searchProductByName(@PathVariable("name")  String name) {
        Product byproductName = productRepository.findByproductName(name);
        if (byproductName != null)
            return ResponseEntity.status(HttpStatus.FOUND).body(byproductName);
        else
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("product not found by name");
      }
      //localhost:8080/product1?name=sweets
    @GetMapping("/product1")
    //public ResponseEntity<?> searchProductByName(@PathVariable("name")  String name) {
    public ResponseEntity<?> searchProductByName1(@RequestParam("name")  String name) {
        Product byproductName = productRepository.findByproductName(name);
        if (byproductName != null)
            return ResponseEntity.status(HttpStatus.FOUND).body(byproductName);
        else
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("product not found by name");
      }

   @GetMapping("/product/{name}/{id}")
    public ResponseEntity<?> searchProductByNameAndId(@PathVariable("name")  String name, @PathVariable("id") int id) {
        Product byproductName = productRepository.findByproductNameAndproductId(name,id);
        if (byproductName != null)
            return ResponseEntity.status(HttpStatus.FOUND).body(byproductName);
        else
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("product not found by name and id ");
      }
   @GetMapping("/product1/{name}/{cost}")
    public ResponseEntity<?> searchProductByNameAndCost(@PathVariable("name")  String name, @PathVariable("cost") float cost) {
        Product byproductName = productRepository.findByproductNameAndproductCost(name,cost);
        if (byproductName != null)
            return ResponseEntity.status(HttpStatus.FOUND).body(byproductName);
        else
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("product not found by name and cost ");
      }
    }
