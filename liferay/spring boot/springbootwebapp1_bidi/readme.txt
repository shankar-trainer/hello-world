Implementing a One-to-One Bidirectional relationship in Spring Boot using Lombok requires careful handling of boilerplate code, JSON serialization (to avoid infinite recursion), and database mapping.

Here is a complete, production-ready example mapping a User to a UserProfile.

1. Maven Dependencies
Ensure you have Spring Data JPA, your choice of database driver, and Lombok in your pom.xml:

XML
<dependencies>
    <!-- Spring Data JPA -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>
    
    <!-- Spring Web -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>

    <!-- H2 Database for testing -->
    <dependency>
        <groupId>com.h2database</groupId>
        <artifactId>h2</artifactId>
        <scope>runtime</scope>
    </dependency>

    <!-- Lombok -->
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <optional>true</optional>
    </dependency>
</dependencies>
2. Entity Classes
In a bidirectional mapping, one side is the owner (contains the foreign key column) and the other is the inverse (mapped by the owner). We use Jackson annotations (@JsonManagedReference / @JsonBackReference or @JsonIgnore) to prevent infinite loops during JSON serialization.

User.java (The Parent / Owner Side)
The User entity owns the relationship and holds the foreign key (user_profile_id).

Java
package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String email;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "user_profile_id", referencedColumnName = "id")
    private UserProfile userProfile;
}
UserProfile.java (The Child / Inverse Side)
The UserProfile points back to User using the mappedBy attribute.

⚠️ Lombok Warning: Avoid using @Data, @ToString, or @EqualsAndHashCode carelessly on bidirectional entities, as they can trigger infinite loops or lazy-loading issues. Stick to @Getter, @Setter, and explicitly exclude or implement toString() if needed.

Java
package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "user_profiles")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String phoneNumber;

    private String address;

    @OneToOne(mappedBy = "userProfile", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore // Prevents infinite recursion when serializing to JSON
    private User user;
}
3. Repositories
Create standard Spring Data JPA interfaces for database operations.

Java
package com.example.demo.repository;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
Java
package com.example.demo.repository;

import com.example.demo.entity.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {
}
4. Controller
A simple REST controller to test saving and retrieving the mapped entities.

Java
package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor // Automatically injects final fields via constructor
public class UserController {

    private final UserRepository userRepository;

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        // If profile is passed, ensure bi-directional link is synchronized if needed,
        // though CascadeType.ALL handles persistence.
        User savedUser = userRepository.save(user);
        return ResponseEntity.ok(savedUser);
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(userRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        return userRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
5. Testing the Endpoint
application.properties
spring.h2.console.path=/h2-console

You can send a POST request to http://localhost:8080/api/users with the following JSON payload:
// http://localhost:8080/api/users 
post 
JSON
{
    "username": "john_doe",
    "email": "john@example.com",
    "userProfile": {
        "phoneNumber": "+1234567890",
        "address": "123 Main Street, New York"
    }
}