GET: http://localhost:8080/employee-service/employees/1

https://www.geeksforgeeks.org/java/spring-boot-microservices-communication-using-webclient-with-example/

Spring Boot Microservices Communication using WebClient with Example
Last Updated : 23 Jul, 2025
WebClient is an interface illustrating the main entry point for performing web requests. It is also known as the reactive web client which is introduced in Spring 5. This new client is a reactive, non-blocking solution that works over the HTTP/1.1 protocol. We can also say that it is a replacement for the classic RestTemplate. It is a part of spring-webflux library and also offers support for both synchronous and asynchronous operations. The DefaultWebClient class implements this WebClient interface. The basic syntax is given below

class DefaultWebClient implements WebClient {
    ....................
    ....................
}
How to Use WebClient?
For Maven:
Add this dependency to the pom.xml file.

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-webflux</artifactId>
</dependency>
For Gradle:
Add the following entries to the build.gradle file.

dependencies {
    compile 'org.springframework.boot:spring-boot-starter-webflux'
}
After adding the library create Bean for WebClient in the configuration file like below

@Bean
public WebClient webClient() {
  return WebClient.builder().baseUrl(addressBaseUrl).build();
}
Now it's ready for use in the service class file. You can refer to the below code

@Service
public class EmployeeService {


    // More Code Here


    // -------------

    @Autowired
    private WebClient webClient;

    public EmployeeResponse getEmployeeById(int id) {


    // More Code Here

    // --------------


        // Using WebClient
        AddressResponse addressResponse = webClient.get().uri("/address/" + id).retrieve().bodyToMono(AddressResponse.class).block();
        employeeResponse.setAddressResponse(addressResponse);

        return employeeResponse;
    }

}
Let's understand the whole thing by developing two microservices and let's communicate with each other using WebClient.

Example Project
In this project, we are going to develop two Microservices

employee-service
address-service
Developing Employee-Service Step by Step
Step 1: Create a New Spring Boot Project in Spring Initializr

To create a new Spring Boot project, please refer to How to Create a Spring Boot Project in Spring Initializr and Run it in IntelliJ IDEA. For this project choose the following things

Project: Maven
Language: Java
Packaging: Jar
Java: 17
 Please choose the following dependencies while creating the project.

Spring Boot DevTools
Spring Data JPA
MySQL Driver
Spring Web
Generate the project and run it in IntelliJ IDEA by referring to the above article.

Note: We have used the MySQL database in this project.


Step 2: Create Schema in MySQL Workbench and Put Some Sample Data

Go to your MySQL Workbench and create a schema named gfgmicroservicesdemo and inside that create a table called employee and put some sample data as shown in the below image. Here we have created 4 columns and put some sample data.

id
name
email
age
Spring-Boot-Microservices-1-(2)

Now we are going to fetch Employee Data from Employee Table in our Spring Boot project. To do it refer to the following steps. Before moving to IntelliJ IDEA let's have a look at the complete project structure for our Microservices.

microservice-communication-4

Step 3: Make Changes in Your application.properties File

Now make the following changes in your application.properties file.

spring.datasource.url=jdbc:mysql://localhost:3306/gfgmicroservicesdemo
spring.datasource.username=put your username here
spring.datasource.password=put your password here

spring.application.name=employee-service
server.port=8080

# Set Your Context Path Here
server.servlet.context-path=/employee-service

addressservice.base.url=http://localhost:8081/address-service
Step 4: Create Your Entity/Model Class

Go to the src > main > java > entity and create a class Employee and put the below code. This is our model class.


package com.gfg.employeaap.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "age")
    private String age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
Step 5: Create Your Repository Interface

Go to the src > main > java > repository and create an interface EmployeeRepo and put the below code. This is our repository where we write code for all the database-related stuff.


package com.gfg.employeaap.repository;

import com.gfg.employeaap.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
Note: Please refer to this article to know more about JpaRepository.


Step 6: Create an EmployeeResponse Class

Go to the src > main > java > response and create a class EmployeeResponse and put the below code.


package com.gfg.employeaap.response;

public class EmployeeResponse {

    private int id;
    private String name;
    private String email;
    private String age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
Step 7: Create Your Service Class

Go to the src > main > java > service and create a class EmployeeService and put the below code. This is our service class where we write our business logic.


package com.gfg.employeaap.service;

import com.gfg.employeaap.entity.Employee;
import com.gfg.employeaap.repository.EmployeeRepo;
import com.gfg.employeaap.response.EmployeeResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Autowired
    private ModelMapper mapper;

    public EmployeeResponse getEmployeeById(int id) {
        Optional<Employee> employee = employeeRepo.findById(id);
        EmployeeResponse employeeResponse = mapper.map(employee, EmployeeResponse.class);
        return employeeResponse;
    }

}
Step 8: Create an Employee Controller

Go to the src > main > java > controller and create a class EmployeeController and put the below code. Here we are going to create an endpoint "/employees/{id}" to find an employee using id.


package com.gfg.employeaap.controller;

import com.gfg.employeaap.response.EmployeeResponse;
import com.gfg.employeaap.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees/{id}")
    private ResponseEntity<EmployeeResponse> getEmployeeDetails(@PathVariable("id") int id) {
        EmployeeResponse employee = employeeService.getEmployeeById(id);
        return ResponseEntity.status(HttpStatus.OK).body(employee);
    }

}
Step 9: Create a Configuration Class

Go to the src > main > java > configuration and create a class EmployeeConfig and put the below code.


package com.gfg.employeaap.configuration;

import com.gfg.employeaap.service.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfig {

    @Bean
    public ModelMapper modelMapperBean() {
        return new ModelMapper();
    }

}
Note: You may refer to these two articles


Spring @Configuration Annotation with Example
Spring @Bean Annotation with Example
Before running the Microservice below is the complete pom.xml file. Please cross-verify if you have missed some dependencies


<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="https://maven.apache.org/POM/4.0.0"
         xmlns:xsi="https://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="https://maven.apache.org/POM/4.0.0
                        https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>3.0.2</version>
        <relativePath/> <!-- lookup parent from repository -->
    </parent>
    <groupId>com.gfg.employeaap</groupId>
    <artifactId>employee-service</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <name>employee-service</name>
    <description>Employee Service</description>
    <properties>
        <java.version>17</java.version>
    </properties>
    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-devtools</artifactId>
            <scope>runtime</scope>
            <optional>true</optional>
        </dependency>
        <dependency>
            <groupId>com.mysql</groupId>
            <artifactId>mysql-connector-j</artifactId>
            <scope>runtime</scope>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.modelmapper</groupId>
            <artifactId>modelmapper</artifactId>
            <version>3.1.1</version>
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
Step 10: Run Your Employee Microservice

To run your Employee Microservice src > main > java > EmployeeServiceApplication and click on the Run button. If everything goes well then you may see the following screen in your console. Please refer to the below image.

context-path-2

Step 11: Test Your Endpoint in Postman

Now open Postman and hit the following URL

GET: http://localhost:8080/employee-service/employees/1
And you can see the following response

{
    "id": 1,
    "name": "Amiya",
    "email": "ar@gmail",
    "age": "25"
}
Developing Address-Service Step by Step
Step 1: Create a New Spring Boot Project in Spring Initializr

To create a new Spring Boot project, please refer to How to Create a Spring Boot Project in Spring Initializr and Run it in IntelliJ IDEA. For this project choose the following things

Project: Maven
Language: Java
Packaging: Jar
Java: 17
 Please choose the following dependencies while creating the project.

Spring Boot DevTools
Spring Data JPA
MySQL Driver
Spring Web
Generate the project and run it in IntelliJ IDEA by referring to the above article.

Note: We have used the MySQL database in this project.


Step 2: Create Schema in MySQL Workbench and Put Some Sample Data

Go to your MySQL Workbench and create a schema named gfgmicroservicesdemo and inside that create a table called address and put some sample data as shown in the below image.

Address Table:

Here we have created 4 columns and put some sample data.

id
city
state
employee_id
Note: In the Address table, employee_id is a foreign key so create it accordingly. We are going to perform a SQL join operation in our native SQL query. So create tables carefully.


Spring-Boot-Native-Query-1

Before moving to IntelliJ IDEA let's have a look at the complete project structure for our Microservices.

Spring-Boot-Native-Query-2

Step 3: Make Changes in Your application.properties File

Now make the following changes in your application.properties file.

spring.datasource.url=jdbc:mysql://localhost:3306/gfgmicroservicesdemo
spring.datasource.username=put your username here
spring.datasource.password=put your password here

spring.application.name=address-service
server.port=8081
server.servlet.context-path=/address-service
Step 4: Create Your Entity/Model Class

Go to the src > main > java > entity and create a class Address and put the below code. This is our model class.


package com.gfg.addressapp.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
Step 5: Create Your Repository Interface

Go to the src > main > java > repository and create an interface AddressRepo and put the below code. This is our repository where we write code for all the database-related stuff.


package com.gfg.addressapp.repository;

import com.gfg.addressapp.entity.Address;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
public interface AddressRepo extends JpaRepository<Address, Integer> {

    @Query(
        nativeQuery = true,
        value
        = "SELECT ea.id, ea.city, ea.state FROM gfgmicroservicesdemo.address ea join gfgmicroservicesdemo.employee e on e.id = ea.employee_id where ea.employee_id=:employeeId")
       Optional<Address> findAddressByEmployeeId(@Param("employeeId") int employeeId);
}
Note: Please refer to this article to know more about JpaRepository.


Step 6: Create an AddressResponse Class

Go to the src > main > java > response and create a class AddressResponse and put the below code.


package com.gfg.addressapp.response;

public class AddressResponse {

    private int id;
    private String city;
    private String state;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
Step 7: Create Your Service Class

Go to the src > main > java > service and create a class AddressService and put the below code. This is our service class where we write our business logic.


package com.gfg.addressapp.service;

import com.gfg.addressapp.entity.Address;
import com.gfg.addressapp.repository.AddressRepo;
import com.gfg.addressapp.response.AddressResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressService {

    @Autowired
    private AddressRepo addressRepo;

    @Autowired
    private ModelMapper mapper;

    public AddressResponse findAddressByEmployeeId(int employeeId) {
        Optional<Address> addressByEmployeeId = addressRepo.findAddressByEmployeeId(employeeId);
        AddressResponse addressResponse = mapper.map(addressByEmployeeId, AddressResponse.class);
        return addressResponse;
    }

}
Step 8: Create an Address Controller

Go to the src > main > java > controller and create a class AddressController and put the below code. Here we are going to create an endpoint "/address/{employeeId}" to find the address using employee_id. Thats why we have created a foreign key in the Address table and we have performed the SQL join operation in the native query to get our desired result.


package com.gfg.addressapp.controller;

import com.gfg.addressapp.response.AddressResponse;
import com.gfg.addressapp.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping("/address/{employeeId}")
    public ResponseEntity<AddressResponse> getAddressByEmployeeId(@PathVariable("employeeId") int employeeId) {
        AddressResponse addressResponse = addressService.findAddressByEmployeeId(employeeId);
        return ResponseEntity.status(HttpStatus.OK).body(addressResponse);
    }

}
Step 9: Create a Configuration Class

Go to the src > main > java > configuration and create a class AddressConfig and put the below code.


package com.gfg.addressapp.configuration;

import com.gfg.addressapp.service.AddressService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AddressConfig {

    @Bean
    public ModelMapper modelMapperBean() {
        return new ModelMapper();
    }

}
Note: You may refer to these two articles


Spring @Configuration Annotation with Example
Spring @Bean Annotation with Example
Before running the Microservice below is the complete pom.xml file. Please cross-verify if you have missed some dependencies


<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="https://maven.apache.org/POM/4.0.0" xmlns:xsi="https://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="https://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>3.0.2</version>
        <relativePath/> <!-- lookup parent from repository -->
    </parent>
    <groupId>com.gfg.addressapp</groupId>
    <artifactId>address-service</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <name>address-service</name>
    <description>Address Service</description>
    <properties>
        <java.version>17</java.version>
    </properties>
    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-devtools</artifactId>
            <scope>runtime</scope>
            <optional>true</optional>
        </dependency>
        <dependency>
            <groupId>com.mysql</groupId>
            <artifactId>mysql-connector-j</artifactId>
            <scope>runtime</scope>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.modelmapper</groupId>
            <artifactId>modelmapper</artifactId>
            <version>3.1.1</version>
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
Step 10: Run Your Address Microservice

To run your Address Microservice src > main > java > AddressServiceApplication and click on the Run button. If everything goes well then you may see the following screen in your console. Please refer to the below image.

Spring-Boot-Native-Query-4

Step 11: Test Your Endpoint in Postman

Now open Postman and hit the following URL

GET: http://localhost:8081/address-service/address/2
And you can see the following response

{
    "id": 1,
    "city": "BLS",
    "state": "Odisha"
}
Microservices Communication using WebClient
Now let's communicate between two microservices using RestTemplate. So we are going to get the address data by the employeeId of an employee and when we communicate we are going to get a response like the below. So let's implement it.

{
    "id": 2,
    "name": "Asish",
    "email": "asis@gmail",
    "age": "30",
    "addressResponse": {
        "id": 1,
        "city": "BLS",
        "state": "Odisha"
    }
}
Here employee-service is going to consume data from the address-service. So let's write the logic in the employee-service.

Step 1: Create an AddressResponse Class

Go to the employee-service > src > main > java > response and create a class AddressResponse and put the below code.


package com.gfg.employeaap.response;

public class AddressResponse {

    private int id;
    private String city;
    private String state;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
Step 2: Modify EmployeeResponse Class

Also, go to the employee-service > src > main > java > response > EmployeeResponse and modify the EmployeeResponse class as below.


package com.gfg.employeaap.response;

public class EmployeeResponse {

    private int id;
    private String name;
    private String email;
    private String age;

    // Add AddressResponse Here
    private AddressResponse addressResponse;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public AddressResponse getAddressResponse() {
        return addressResponse;
    }

    public void setAddressResponse(AddressResponse addressResponse) {
        this.addressResponse = addressResponse;
    }
}
Please refer to the below image.

microservice-communication-1

Step 3: Add webflux dependency to the pom.xml file

Add this dependency to the pom.xml file.

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-webflux</artifactId>
</dependency>
Please cross-verify the pom.xml file if you have missed some dependencies.


<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="https://maven.apache.org/POM/4.0.0"
         xmlns:xsi="https://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="https://maven.apache.org/POM/4.0.0
                        https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>3.0.2</version>
        <relativePath/> <!-- lookup parent from repository -->
    </parent>
    <groupId>com.gfg.employeaap</groupId>
    <artifactId>employee-service</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <name>employee-service</name>
    <description>Employee Service</description>
    <properties>
        <java.version>17</java.version>
    </properties>
    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-devtools</artifactId>
            <scope>runtime</scope>
            <optional>true</optional>
        </dependency>
        <dependency>
            <groupId>com.mysql</groupId>
            <artifactId>mysql-connector-j</artifactId>
            <scope>runtime</scope>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.modelmapper</groupId>
            <artifactId>modelmapper</artifactId>
            <version>3.1.1</version>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-webflux</artifactId>
        </dependency>
        <dependency>
            <groupId>io.projectreactor</groupId>
            <artifactId>reactor-test</artifactId>
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
Step 4: Modify EmployeeConfig Class

Go to the employee-service > src > main > java > configuration > EmployeeConfig and create the bean for WebClient.

@Bean
public WebClient webClient() {
    return WebClient.builder().baseUrl(addressBaseUrl).build();
}
Below is the complete code for EmployeeConfig Class.


package com.gfg.employeaap.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class EmployeeConfig {

    @Value("${addressservice.base.url}")
    private String addressBaseUrl;

    @Bean
    public ModelMapper modelMapperBean() {
        return new ModelMapper();
    }

    @Bean
    public WebClient webClient() {
        return WebClient.builder().baseUrl(addressBaseUrl).build();
    }

}
Step 5: Modify EmployeeService Class

Now go to the employee-service > src > main > java > service > EmployeeService and modify the EmployeeService class as below. Add the below code inside this class.

@Autowired
private WebClient webClient;

AddressResponse addressResponse = webClient.get().uri("/address/" + id).retrieve().bodyToMono(AddressResponse.class).block();
employeeResponse.setAddressResponse(addressResponse);
Below is the complete code for EmployeeService Class.


package com.gfg.employeaap.service;

import com.gfg.employeaap.entity.Employee;
import com.gfg.employeaap.repository.EmployeeRepo;
import com.gfg.employeaap.response.AddressResponse;
import com.gfg.employeaap.response.EmployeeResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Autowired
    private ModelMapper mapper;

    @Autowired
    private WebClient webClient;

    public EmployeeResponse getEmployeeById(int id) {

        Optional<Employee> employee = employeeRepo.findById(id);
        EmployeeResponse employeeResponse = mapper.map(employee, EmployeeResponse.class);

        // Using WebClient
        AddressResponse addressResponse = webClient.get().uri("/address/" + id).retrieve().bodyToMono(AddressResponse.class).block();
        employeeResponse.setAddressResponse(addressResponse);

        return employeeResponse;
    }

}
Step 6: Run Your Both Address and Employee Microservices

Now run your both Address and Employee Microservices. If everything goes well then you may see the following screen in your console. Please refer to the below image.

microservice-communication-2

Step 7: Test Your Endpoint in Postman

Now open Postman and hit the following URL

GET: http://localhost:8080/employee-service/employees/2
And you can see the following response

{
    "id": 2,
    "name": "Asish",
    "email": "asis@gmail",
    "age": "30",
    "addressResponse": {
        "id": 1,
        "city": "BLS",
        "state": "Odisha"
    }
}
Please refer to the below image.

