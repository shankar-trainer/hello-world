google search
webclient spring boot example employee-service and address-service

Here is an example of using Spring WebClient for communication between an employee-service and an address-service in Spring Boot:
1. Address Service (address-service)
This service provides address details based on an employee ID.
Java

// Address.java
package com.example.addressservice.model;

public class Address {
    private Long id;
    private Long employeeId;
    private String street;
    private String city;
    private String zipCode;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Long getEmployeeId() { return employeeId; }
    public void setEmployeeId(Long employeeId) { this.employeeId = employeeId; }
    public String getStreet() { return street; }
    public void setStreet(String street) { this.street = street; }
    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }
    public String getZipCode() { return zipCode; }
    public void setZipCode(String zipCode) { this.zipCode = zipCode; }
}

// AddressController.java
package com.example.addressservice.controller;

import com.example.addressservice.model.Address;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/addresses")
public class AddressController {

    @GetMapping("/{employeeId}")
    public Mono<Address> getAddressByEmployeeId(@PathVariable Long employeeId) {
        // In a real application, you would fetch this from a database
        Address address = new Address();
        address.setId(1L);
        address.setEmployeeId(employeeId);
        address.setStreet("123 Main St");
        address.setCity("Anytown");
        address.setZipCode("12345");
        return Mono.just(address);
    }
}
2. Employee Service (employee-service)
This service retrieves employee details and then uses WebClient to fetch the corresponding address from the address-service.
Java

// Employee.java
package com.example.employeeservice.model;

import com.example.employeeservice.dto.AddressDTO; // Create this DTO

public class Employee {
    private Long id;
    private String name;
    private String email;
    private AddressDTO address; // To hold the address details

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public AddressDTO getAddress() { return address; }
    public void setAddress(AddressDTO address) { this.address = address; }
}

// AddressDTO.java (in employee-service)
package com.example.employeeservice.dto;

public class AddressDTO {
    private String street;
    private String city;
    private String zipCode;

    // Getters and Setters
    public String getStreet() { return street; }
    public void setStreet(String street) { this.street = street; }
    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }
    public String getZipCode() { return zipCode; }
    public void setZipCode(String zipCode) { this.zipCode = zipCode; }
}

// EmployeeService.java
package com.example.employeeservice.service;

import com.example.employeeservice.model.Employee;
import com.example.employeeservice.dto.AddressDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class EmployeeService {

    private final WebClient webClient;

    public EmployeeService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("http://localhost:8081/addresses").build();
    }

    public Mono<Employee> getEmployeeWithAddress(Long id) {
        // In a real application, you would fetch employee from a database
        Employee employee = new Employee();
        employee.setId(id);
        employee.setName("John Doe");
        employee.setEmail("john.doe@example.com");

        return webClient.get()
                .uri("/{employeeId}", id)
                .retrieve()
                .bodyToMono(AddressDTO.class)
                .map(addressDTO -> {
                    employee.setAddress(addressDTO);
                    return employee;
                });
    }
}

// EmployeeController.java
package com.example.employeeservice.controller;

import com.example.employeeservice.model.Employee;
import com.example.employeeservice.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/{id}")
    public Mono<Employee> getEmployeeById(@PathVariable Long id) {
        return employeeService.getEmployeeWithAddress(id);
    }
}
Explanation:
The address-service exposes an endpoint /addresses/{employeeId} that returns an Address object.
The employee-service injects WebClient.Builder to create a WebClient instance configured with the base URL of the address-service.
In EmployeeService, when getEmployeeWithAddress is called, it first creates an Employee object.
Then, it uses webClient.get().uri("/{employeeId}", id).retrieve().bodyToMono(AddressDTO.class) to make an asynchronous HTTP GET request to the address-service and retrieve the address details as an AddressDTO.
Finally, it uses map to combine the fetched AddressDTO with the Employee object and return a Mono<Employee>.
To run this example:
Create two separate Spring Boot projects (e.g., using Spring Initializr).
Add Spring WebFlux dependency to both projects for WebClient (it's part of WebFlux).
Copy the respective code into each project.
Ensure the address-service runs on a different port (e.g., 8081) than the employee-service (e.g., 8080) by configuring server.port in application.properties.
Start both services.
Access the employee-service endpoint (e.g., http://localhost:8080/employees/1) to see the employee details including the address fetched from the address-service.
