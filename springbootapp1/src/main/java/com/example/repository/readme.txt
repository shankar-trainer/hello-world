Repository
|
|
Service
 |   exception handling
 |
Coontroller



























In Spring Boot, a Data Transfer Object (DTO) is a simple Java object used to transfer data between the client and the server. Instead of exposing your database @Entity classes directly, you separate concerns into Request DTOs (input from the client) and Response DTOs (output to the client).Using Java Records (introduced in Java 14) is the modern industry standard for defining DTOs since they are immutable, concise, and eliminate boilerplate code.1. The Core Architecture FlowClient sends an HTTP request payload (JSON).Controller deserializes the JSON into a Request DTO and runs validation rules.Service Layer maps the Request DTO into a Database Entity to run business logic and persist data.Repository saves the Entity to the database.Service Layer maps the updated Entity back into a Response DTO.Controller returns the Response DTO, which is serialized back into JSON for the client.2. Implementation ExampleStep 1: Define the Database EntityThe entity matches your database schema. Notice it includes internal or sensitive fields like id and password that we shouldn't loosely expose.javapackage com.example.api.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String password; // Sensitive field
}
Use code with caution.Step 2: Create the Request DTO (Input)The client shouldn't provide the id during creation, but does need to provide a password. We can use Jakarta validation annotations to ensure incoming data is clean.javapackage com.example.api.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UserRequestDTO(
    @NotBlank(message = "Name cannot be empty")
    String name,

    @Email(message = "Invalid email format")
    @NotBlank(message = "Email cannot be empty")
    String email,

    @NotBlank(message = "Password cannot be empty")
    @Size(min = 8, message = "Password must be at least 8 characters")
    String password
) {}
Use code with caution.Step 3: Create the Response DTO (Output)When returning data, we strip out the password field for security reasons and include the auto-generated id.javapackage com.example.api.dto;

public record UserResponseDTO(
    Long id,
    String name,
    String email
) {}
Use code with caution.Step 4: Handle the Mappings in the Service LayerYou can manually map fields or use automated libraries like MapStruct or ModelMapper. Below is a clean, manual mapping approach:javapackage com.example.api.service;

import com.example.api.dto.UserRequestDTO;
import com.example.api.dto.UserResponseDTO;
import com.example.api.model.User;
import com.example.api.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserResponseDTO createUser(UserRequestDTO requestDTO) {
        // 1. Map Request DTO -> Entity
        User user = new User();
        user.setName(requestDTO.name());
        user.setEmail(requestDTO.email());
        user.setPassword(requestDTO.password()); // In a real app, encrypt this first!

        // 2. Persist Entity
        User savedUser = userRepository.save(user);

        // 3. Map Entity -> Response DTO
        return new UserResponseDTO(
            savedUser.getId(),
            savedUser.getName(),
            savedUser.getEmail()
        );
    }
}
Use code with caution.Step 5: Implement the REST ControllerUse @Valid to enforce the annotations set inside your Request DTO and @RequestBody to automatically bind the JSON payload to the Java record.javapackage com.example.api.controller;

import com.example.api.dto.UserRequestDTO;
import com.example.api.dto.UserResponseDTO;
import com.example.api.service.UserService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<UserResponseDTO> createUser(@Valid @RequestBody UserRequestDTO requestDTO) {
        UserResponseDTO response = userService.createUser(requestDTO);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
Use code with caution.3. Quick Comparison: Request vs. Response DTOsFeatureRequest DTO (Input)Response DTO (Output)Primary PurposeCaptures incoming data from API consumers.Shapes data returned back to the API consumers.Typical FieldsWrite-only fields like password, raw inputs.Metadata fields like generated IDs, creation timestamps.ValidationHighly annotated with @NotNull, @Size, etc.Rarely requires validation annotations.Security RiskLow (acting as a strict filter for incoming data).Critically shields sensitive DB columns from being leaked.Would you like me to show you how to set up automatic mapping for these objects using MapStruct, or would you prefer a strategy for handling Global Exception Handling to catch the DTO validation errors?





