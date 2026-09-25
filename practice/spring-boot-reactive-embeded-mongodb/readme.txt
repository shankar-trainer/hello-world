
Building a Spring Boot Reactive application with an embedded MongoDB instance is ideal for rapid prototyping, local development, and running fast integration tests without installing a standalone database.

Below is a complete guide and example using Spring Boot 3.x, Spring WebFlux, Spring Data Reactive MongoDB, and Flapdoodle Embedded MongoDB.

Step 1: Add Dependencies (pom.xml)
Include the reactive web starter, the reactive MongoDB data starter, and the Flapdoodle embedded database integration library.

==============================

<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>4.1.1</version>
        <relativePath/> <!-- lookup parent from repository -->
    </parent>
    <groupId>com.example</groupId>
    <artifactId>demo</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <name/>
    <description/>
    <url/>
    <licenses>
        <license/>
    </licenses>
    <developers>
        <developer/>
    </developers>
    <scm>
        <connection/>
        <developerConnection/>
        <tag/>
        <url/>
    </scm>
    <properties>
        <java.version>17</java.version>
    </properties>
    <dependencies>

        <!-- Source: https://mvnrepository.com/artifact/de.flapdoodle.embed/de.flapdoodle.embed.mongo -->
        <dependency>
            <groupId>de.flapdoodle.embed</groupId>
            <artifactId>de.flapdoodle.embed.mongo</artifactId>
            <version>5.0.0</version>
            <scope>test</scope>
        </dependency>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-mongodb</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-webflux</artifactId>
        </dependency>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-mongodb-test</artifactId>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-webflux-test</artifactId>
            <scope>test</scope>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>

</project>

==========================

XML

    
    
        org.springframework.boot
        spring-boot-starter-webflux
    

    
    
        org.springframework.boot
        spring-boot-starter-data-mongodb-reactive
    

    
    
        de.flapdoodle.embed
        de.flapdoodle.embed.mongo.spring3x
        4.33.0
        test 
    

    
    
        org.springframework.boot
        spring-boot-starter-test
        test
    
    
        io.projectreactor
        reactor-test
        test
    

Step 2: Create the Domain Document
Define a standard model annotated with Spring Data's @Document.

Code snippet

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {

    @Id
    private String id;
    private String name;
    private String email;

    public User() {}

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}

Step 3: Create the Reactive Repository
Extending ReactiveMongoRepository gives you non-blocking CRUD operations out of the box returning Mono and Flux publishers.

Java
package com.example.reactive.repository;

import com.example.reactive.model.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends ReactiveMongoRepository {
}

Step 4: Create a Reactive REST Controller
Expose non-blocking HTTP endpoints using WebFlux router functions or a @RestController.

Java
package com.example.reactive.controller;

import com.example.reactive.model.User;
import com.example.reactive.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserController(UserRepository userRepository)) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public Flux getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public Mono getUserById(@PathVariable String id) {
        return userRepository.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mono createUser(@RequestBody User user) {
        return userRepository.save(user);
    }
}
Step 5: Configuration & Initialization (Optional)
If you want to pre-load sample data into your embedded database when the application boots up, you can use a CommandLineRunner with ReactiveMongoOperations:

Java
package com.example.reactive.config;

import com.example.reactive.model.User;
import com.example.reactive.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Flux;

@Configuration
public class DatabaseInitializer {

    @Bean
    CommandLineRunner initData(UserRepository userRepository) {
        return args -> {
            userRepository.deleteAll()
                .thenMany(userRepository.saveAll(Flux.just(
                    new User("Alice", "alice@example.com"),
                    new User("Bob", "bob@example.com")
                )))
                .subscribe();
        };
    }
}

in application.properties 

spring.mongodb.embedded.version=6.0.5
spring.data.mongodb.database=reactive_test_db



Step 6: Writing an Integration Test
Flapdoodle automatically spins up an isolated instance of MongoDB on a random free port for your test lifecycle.

Java
package com.example.reactive;

import com.example.reactive.model.User;
import com.example.reactive.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.core.publisher.Flux;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureWebTestClient
class UserReactiveApplicationTests {

    @Autowired
    private WebTestClient webTestClient;

    @Autowired
    private UserRepository userRepository;

    @BeforeEach
    void setUp() {
        userRepository.deleteAll().block();
    }

    @Test
    void testCreateUser() {
        User newUser = new User("Charlie", "charlie@example.com");

        webTestClient.post().uri("/users")
                .bodyValue(newUser)
                .exchange()
                .expectStatus().isCreated()
                .expectBody()
                .jsonPath("$.name").isEqualTo("Charlie");
    }

    @Test
    void testGetAllUsers() {
        userRepository.saveAll(Flux.just(
                new User("Dave", "dave@example.com")
        )).blockLast();

        webTestClient.get().uri("/users")
                .exchange()
                .expectStatus().isOk()
                .expectBodyList(User.class)
                .hasSize(1);
    }
}
Would you like to explore how to configure security or write reactive custom aggregation queries for this setup?

=====================================


spring boot 4.1.1  reactive with embedded mongodb example


To configure a reactive stack using Spring Boot 4.1.1 (built on Spring Framework 7 and Java 17+) with an embedded MongoDB instance, you have two primary options: the modernized Flapdoodle Embedded MongoDB loop or the Spring-recommended Testcontainers approach with @ServiceConnection.Below is the complete example using Flapdoodle tailored for Spring Boot 4.x architectures.1. Maven Dependencies (pom.xml)In Spring Boot 4.1.1, auto-configuration hooks for embedded databases remain decoupled. You need the reactive web/data starters along with the updated Flapdoodle spring extension:xml<dependencies>
    <!-- Spring WebFlux for Reactive Routing -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-webflux</artifactId>
    </dependency>

    <!-- Spring Data Reactive MongoDB -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-mongodb-reactive</artifactId>
    </dependency>

    <!-- Flapdoodle Embedded Mongo for Spring Boot 4.x/3.x -->
    <dependency>
        <groupId>de.flapdoodle.embed</groupId>
        <artifactId>de.flapdoodle.embed.mongo.spring3x</artifactId>
        <version>4.12.2</version>
    </dependency>

    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <optional>true</optional>
    </dependency>
</dependencies>
Use code with caution.2. Properties Configuration (application.yml)Define the local port and database mappings for the localized in-memory worker:yamlspring:
  data:
    mongodb:
      host: localhost
      port: 27017
      database: reactive_app_db
Use code with caution.3. Programmatic Embedded MongoDB Lifecycle ConfigBecause modern Spring Boot generations require manual process initialization for custom embedded layers, you use a configuration bean managing the TransitionWalker lifecycle context:javapackage com.example.reactive.config;

import de.flapdoodle.embed.mongo.distribution.Version;
import de.flapdoodle.embed.mongo.transitions.Mongod;
import de.flapdoodle.embed.mongo.transitions.RunningMongodProcess;
import de.flapdoodle.reverse.TransitionWalker;
import org.springframework.context.annotation.Configuration;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Configuration
public class EmbeddedMongoLifecycleConfig {

    private TransitionWalker.ReachedState<RunningMongodProcess> runningMongoInstance;

    @PostConstruct
    public void startEmbeddedMongo() {
        // Automatically provisions and builds MongoDB process locally on port 27017
        this.runningMongoInstance = Mongod.instance()
                .start(Version.Main.V7_0); 
    }

    @PreDestroy
    public void stopEmbeddedMongo() {
        if (this.runningMongoInstance != null) {
            this.runningMongoInstance.close();
        }
    }
}
Use code with caution.4. Data Model & Reactive RepositoryDefine a standard document model alongside a non-blocking ReactiveMongoRepository utilizing Project Reactor primitives (Mono and Flux):javapackage com.example.reactive.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "customers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    private String id;
    private String name;
    private String email;
}
Use code with caution.javapackage com.example.reactive.repository;

import com.example.reactive.model.Customer;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends ReactiveMongoRepository<Customer, String> {
}
Use code with caution.5. Reactive REST API ControllerLeverage WebFlux asynchronously via a standard RestController layer:javapackage com.example.reactive.controller;

import com.example.reactive.model.Customer;
import com.example.reactive.repository.CustomerRepository;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    private final CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping
    public Flux<Customer> getAll() {
        return customerRepository.findAll();
    }

    @PostMapping
    public Mono<Customer> save(@RequestBody Customer customer) {
        return customerRepository.save(customer);
    }

    @GetMapping("/{id}")
    public Mono<Customer> getById(@PathVariable String id) {
        return customerRepository.findById(id);
    }
}
Use code with caution.Would you like me to show you how to swap this out for Testcontainers using @ServiceConnection, which is the production standard for containerised testing in Spring Boot 4.1.1? Alternately, I can help you set up dynamic port allocations to avoid port conflicts during concurrent integration tests.


=================


For a modern Spring Boot 4.x application (built on top of Spring Framework 7 and Java 17+), setting up a reactive API with an in-memory embedded MongoDB database requires adjusting to newer dependency coordinates.The Flapdoodle Embedded MongoDB project provides a dedicated Spring Boot 3.x/4.x transition module, which seamlessly manages the embedded lifecycle.1. Project Dependencies (pom.xml)In your pom.xml, include the necessary starters for WebFlux and Reactive Data, alongside Flapdoodle's modernized Spring boot auto-configuration artifact:xml<dependencies>
    <!-- Reactive Web Stack -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-webflux</artifactId>
    </dependency>

    <!-- Reactive Spring Data MongoDB -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-mongodb-reactive</artifactId>
    </dependency>

    <!-- Flapdoodle Embedded Mongo for Spring Boot 3.x / 4.x -->
    <dependency>
        <groupId>de.flapdoodle.embed</groupId>
        <artifactId>de.flapdoodle.embed.mongo.spring3x</artifactId>
        <version>4.12.2</version>
    </dependency>

    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <optional>true</optional>
    </dependency>
</dependencies>
Use code with caution.2. Basic Configuration (application.yml)Configure the localized properties so Spring knows where to find the embedded engine instance.yamlspring:
  data:
    mongodb:
      host: localhost
      port: 27017
      database: test_reactive_db
Use code with caution.3. Programmatic Embedded Lifecycle ConfigBecause Spring Boot decoupled automatic third-party configuration hooks for embedded databases, a simple configuration class manages the background process cleanly utilizing @PostConstruct and @PreDestroy:javapackage com.example.demo.config;

import de.flapdoodle.embed.mongo.distribution.Version;
import de.flapdoodle.embed.mongo.transitions.Mongod;
import de.flapdoodle.embed.mongo.transitions.RunningMongodProcess;
import de.flapdoodle.reverse.TransitionWalker;
import org.springframework.context.annotation.Configuration;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Configuration
public class EmbeddedMongoLifecycleConfig {

    private TransitionWalker.ReachedState<RunningMongodProcess> runningMongo;

    @PostConstruct
    public void startEmbeddedMongo() {
        // Automatically downloads and provisions MongoDB v6.0 or v7.0 locally
        this.runningMongo = Mongod.instance()
                .start(Version.Main.V6_0);
    }

    @PreDestroy
    public void stopEmbeddedMongo() {
        if (this.runningMongo != null) {
            this.runningMongo.close();
        }
    }
}
Use code with caution.4. Data Model & Reactive RepositoryDefine your non-blocking entity model and repository interface:javapackage com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "items")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InventoryItem {
    @Id
    private String id;
    private String sku;
    private Integer quantity;
}
Use code with caution.javapackage com.example.demo.repository;

import com.example.demo.model.InventoryItem;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepository extends ReactiveMongoRepository<InventoryItem, String> {
}
Use code with caution.5. Reactive REST API ControllerImplement a standard RestController utilizing Project Reactor's Mono and Flux pipelines for true asynchronous handling:javapackage com.example.demo.controller;

import com.example.demo.model.InventoryItem;
import com.example.demo.repository.InventoryRepository;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/inventory")
public class InventoryController {

    private final InventoryRepository inventoryRepository;

    public InventoryController(InventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }

    @GetMapping
    public Flux<InventoryItem> getAllItems() {
        return inventoryRepository.findAll();
    }

    @PostMapping
    public Mono<InventoryItem> createItem(@RequestBody InventoryItem item) {
        return inventoryRepository.save(item);
    }

    @GetMapping("/{id}")
    public Mono<InventoryItem> getItemById(@PathVariable String id) {
        return inventoryRepository.findById(id);
    }
}
Use code with caution.Would you like to expand this into a JUnit 5 integration test example using @DataMongoTest, or do you need assistance configuring Testcontainers as a modern replacement for Flapdoodle?