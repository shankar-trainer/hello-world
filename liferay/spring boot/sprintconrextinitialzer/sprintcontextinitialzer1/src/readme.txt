AI Overview
An ApplicationContextInitializer is a Spring callback interface used to modify or configure the Spring ConfigurableApplicationContext before it is refreshed. This is ideal for programmatically setting properties, activating profiles, or registering custom beans before the REST API starts.
The following complete, production-ready example combines an ApplicationContextInitializer, an in-memory Map-based database, and a full REST CRUD API.
1. The Domain Entity
Create a standard Java class to represent your data model.
java

package com.example.demo.model;

public class Product {
    private String id;
    private String name;
    private double price;

    public Product() {}

    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}

Use code with caution.
2. The Repository (Data Layer)
A basic repository holding a concurrent map for data persistence.
java

package com.example.demo.repository;

import com.example.demo.model.Product;
import org.springframework.stereotype.Repository;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class ProductRepository {
    private final Map<String, Product> db = new ConcurrentHashMap<>();

    public Product save(Product product) {
        db.put(product.getId(), product);
        return product;
    }

    public Optional<Product> findById(String id) {
        return Optional.ofNullable(db.get(id));
    }

    public Map<String, Product> findAll() {
        return db;
    }

    public void deleteById(String id) {
        db.remove(id);
    }
}

Use code with caution.
3. The Custom ApplicationContextInitializer
This custom initializer programmatically injects dynamic properties into the Spring Environment before the application fully starts.
java

package com.example.demo.config;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.MapPropertySource;
import java.util.HashMap;
import java.util.Map;

public class CustomContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {

    @Override
    public void initialize(ConfigurableApplicationContext context) {
        System.out.println("--- CustomContextInitializer: Initializing Context Pre-Refresh ---");

        // Example: Programmatically setting properties before any beans are created
        Map<String, Object> customProperties = new HashMap<>();
        customProperties.put("app.custom.welcome-message", "Welcome to the Programmatic Spring Boot CRUD API!");

        context.getEnvironment().getPropertySources().addLast(
            new MapPropertySource("customInitializerProperties", customProperties)
        );
    }
}

Use code with caution.
4. The REST Controller (CRUD Endpoints)
The controller handles incoming HTTP requests.
It uses @Value to read the dynamic configuration injected by your custom context initializer.
java

package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductRepository repository;

    @Value("${app.custom.welcome-message}")
    private String welcomeMessage;

    public ProductController(ProductRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/welcome")
    public String getWelcome() {
        return welcomeMessage;
    }

    // CREATE
    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        Product saved = repository.save(product);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }

    // READ ALL
    @GetMapping
    public Collection<Product> getAllProducts() {
        return repository.findAll().values();
    }

    // READ ONE
    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable String id) {
        return repository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // UPDATE
    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable String id, @RequestBody Product product) {
        if (repository.findById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        product.setId(id);
        Product updated = repository.save(product);
        return ResponseEntity.ok(updated);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable String id) {
        if (repository.findById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        repository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}

Use code with caution.
5. Main Application & Registration
To make Spring Boot execute your ApplicationContextInitializer, you must register it.
This can be done programmatically using SpringApplication.addInitializers().
java

package com.example.demo;

import com.example.demo.config.CustomContextInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(DemoApplication.class);

        // Register the context initializer programmatically
        app.addInitializers(new CustomContextInitializer());

        app.run(args);
    }
}

Use code with caution.
(Alternative registration method: You can also register it declaratively by adding context.initializer.classes=com.example.demo.config.CustomContextInitializer to your application.properties file).
CRUD Operations to Test
You can use curl or tools like Postman to test the endpoints:

    Welcome Endpoint: GET http://localhost:8080/api/products/welcome (Returns the initialized property).
    Create: POST http://localhost:8080/api/products with JSON {"id":"1", "name":"Laptop", "price":999.99}
    Read All: GET http://localhost:8080/api/products
    Update: PUT http://localhost:8080/api/products/1 with JSON {"name":"Gaming Laptop", "price":1200.00}
    Delete: DELETE http://localhost:8080/api/products/1

Would you like to see how to use an ApplicationContextInitializer to wire up a Testcontainers database during integrated testing, or do you need help validating input fields inside the REST controller?

