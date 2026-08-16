Implementing CORS Handling in Spring Boot API Gateway
Last Updated : 23 Jul, 2025

Cross-Origin Resource Sharing (CORS) is a mechanism that allows resources on a web server to be requested from a domain other than the one from which the resource originated. In a microservices architecture using Spring Boot API Gateway, handling CORS is essential to ensure that client applications can interact with services behind the gateway without encountering CORS issues.

This article will guide you through setting up CORS handling in the Spring Boot API Gateway using Spring Cloud Gateway.
Main Concept

CORS issues arise when a web application at one origin tries to access resources from a server at another origin. The server needs to explicitly allow these cross-origin requests through HTTP headers. In Spring Cloud Gateway, we can handle CORS by configuring it in the application.yml file or through a custom CorsConfigurationSource.
CORS Configuration in Spring Cloud Gateway
1. Configuration through application.yml

You can set up global CORS configuration in the application.yml file of the Spring Boot project.

spring:
  cloud:
    gateway:
      routes:
        - id: example_route
          uri: http://localhost:8081  # URI of the service to route to
          predicates:
            - Path=/example/**
          filters:
            - AddRequestHeader=MyHeader, MyValue  # Adds a custom header to the request
      globalcors:
        cors-configurations:
          '[/**]':  # Applies to all paths
            allowedOrigins: "*"
            allowedMethods: GET, POST, PUT, DELETE, OPTIONS
            allowedHeaders: "*"
            allowCredentials: true

    routes: Defines the routes for the gateway. It routes requests matching the Path predicate to the specified URI.
    globalcors: Configures global CORS settings for all routes.
        allowedOrigins: Allows requests from any origin (*).
        allowedMethods: Specifies which HTTP methods are allowed.
        allowedHeaders: Allows all headers.
        allowCredentials: Allows cookies and other credentials to be included in cross-origin requests.

2. Configuration through the Java Configuration

Alternatively, configure CORS using the CorsConfigurationSource bean in a configuration class.

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                .allowedHeaders("*")
                .allowCredentials(true);
    }
}

    WebMvcConfigurer: Interface used to configure Spring MVC settings.
    addCorsMappings: Method to add CORS mappings.
        allowedOrigins: Specifies which origins are allowed.
        allowedMethods: Specifies allowed HTTP methods.
        allowedHeaders: Specifies allowed headers.
        allowCredentials: Allows credentials in requests.

Implementing the CORS Handling in Spring Boot API Gateway
Setup the Example Service
Step 1: Create the Spring Boot Project

Create a new Spring Boot project using IntelliJ IDEA.

    Name: example-service
    Language: Java
    Type: Maven
    Packaging: Jar

Click on the Next button.
example-service Project Metadata
Step 2: Add Dependencies

Add the following dependencies into the Spring Boot project.

    Spring Web
    Lombok
    Spring Boot DevTools

Click on the Create button.
Add Dependencies
Project Structure

Once created the project then the file structure will look like the below image.
example-service Project Folder Structure
Step 3: Configure Application Properties

Set up the application properties for the Example Service.

spring.application.name=example-service
server.port=8081

Step 4: Create the ExampleController Class

package com.gfg.exampleservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/example")
public class ExampleController {

    @GetMapping
    public String getExample() {
        return "Hello from Example Service!";  // Response to GET requests
    }
}

    @RestController: Marks the class as a RESTful web service controller.
    @RequestMapping("/example"): Maps requests to /example to this controller.
    @GetMapping: Maps GET requests to the getExample() method.

Step 5: Main class

package com.gfg.exampleservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExampleServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExampleServiceApplication.class, args);
    }

}

pom.xml file:

<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="https://maven.apache.org/POM/4.0.0" xmlns:xsi="https://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="https://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>3.3.3</version>
        <relativePath/> <!-- lookup parent from repository -->
    </parent>
    <groupId>com.gfg</groupId>
    <artifactId>example-service</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <name>example-service</name>
    <description>example-service</description>
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
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <optional>true</optional>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
                <configuration>
                    <excludes>
                        <exclude>
                            <groupId>org.projectlombok</groupId>
                            <artifactId>lombok</artifactId>
                        </exclude>
                    </excludes>
                </configuration>
            </plugin>
        </plugins>
    </build>

</project>

Step 6: Run the Application

Run the Example Service application on port 8081.
example-service Application Starts
Setup the Spring Boot API Gateway
Step 1: Create the new Spring Boot project

Create a new Spring Boot project using IntelliJ IDEA.

    Name: spring-cloud-gateway
    Language: Java
    Type: Maven
    Packaging: Jar

Click on the Next button.
Spring Cloud Gateway Project Metadata
Step 2: Add the Dependencies

Add the following dependencies into the Spring Boot project.

    Spring Web
    Gateway
    Lombok
    Spring Cloud
    Lombok
    Spring Boot DevTools
    Spring Boot Actuator

Click on the Create button.
Add Dependencies
Project Structure

Once created the project then the file structure looks like the below image.
spring cloud gateway Project Folder Structure
Step 3: Configure Application Properties

Rename application.properties to application.yml and add the CORS and Gateway configuration.

spring:
  cloud:
    gateway:
      routes:
        - id: example_route
          uri: http://localhost:8081  # URI of the Example Service
          predicates:
            - Path=/example/**  # Route requests with this path
          filters:
            - AddRequestHeader=MyHeader, MyValue  # Adds a custom header to the request
      globalcors:
        cors-configurations:
          '[/**]':  # Applies to all paths
            allowedOrigins: "*"
            allowedMethods: GET, POST, PUT, DELETE, OPTIONS
            allowedHeaders: "*"
            allowCredentials: true
  main:
    allow-bean-definition-overriding: true
    web-application-type: reactive

    routes: Defines routing for the gateway.
    globalcors: Configures global CORS settings.
        allowedOrigins: Allows all origins.
        allowedMethods: Specifies allowed HTTP methods.
        allowedHeaders: Allows all headers.
        allowCredentials: Allows credentials in requests.

Step 4: Create the CorsConfig Class

Create the CorsConfig Class and this configuration can be used to set the different CORS policies for the different endpoints of Spring Boot project.

package com.gfg.springcloudgateway;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                .allowedHeaders("*")
                .allowCredentials(true);
    }
}

    CorsConfig: Configures CORS settings for the gateway.
    addCorsMappings: Configures global CORS mappings for all paths.

Step 5: Create the RouteConfig Class

This class configures the routing for the Spring Cloud Gateway of the application.

package com.gfg.springcloudgateway;


import org.springframework.cloud.gateway.config.GlobalCorsProperties;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouteConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("example_route", r -> r.path("/example/**")
                        .uri("http://localhost:8081")
                        )
                .build();
    }

    @Bean
    public GlobalCorsProperties globalCorsProperties() {
        return new GlobalCorsProperties();
    }
}

Step 6: Main Class

No changes are required in the main class. This is the entry point of the Spring application.

package com.gfg.springcloudgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCloudGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudGatewayApplication.class, args);
    }

}

pom.xml file:

<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="https://maven.apache.org/POM/4.0.0" xmlns:xsi="https://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="https://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>3.3.3</version>
        <relativePath/> <!-- lookup parent from repository -->
    </parent>
    <groupId>com.gfg</groupId>
    <artifactId>spring-cloud-gateway</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <name>spring-cloud-gateway</name>
    <description>spring-cloud-gateway</description>
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
        <spring-cloud.version>2023.0.3</spring-cloud.version>
    </properties>
    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-actuator</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-webflux</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-gateway-mvc</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-gateway</artifactId>
        </dependency>


        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-devtools</artifactId>
            <scope>runtime</scope>
            <optional>true</optional>
        </dependency>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <optional>true</optional>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
    </dependencies>
    <dependencyManagement>
        <dependencies>
            <dependency>
                <groupId>org.springframework.cloud</groupId>
                <artifactId>spring-cloud-dependencies</artifactId>
                <version>${spring-cloud.version}</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
        </dependencies>
    </dependencyManagement>

    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
                <configuration>
                    <excludes>
                        <exclude>
                            <groupId>org.projectlombok</groupId>
                            <artifactId>lombok</artifactId>
                        </exclude>
                    </excludes>
                </configuration>
            </plugin>
        </plugins>
    </build>

</project>

Step 7: Run the Application

Run the Spring Cloud Gateway application on port 8080.
Spring Cloud Gateway Application Starts
Step 8: Testing the CORS Handling

    Start the Example Service and the Spring Cloud Gateway applications.
    Send a request to http://localhost:8080/example using a tool like Postman.

GET http://localhost:8080/example

Output:

We can see the response "Hello from Example Service!" if everything is set up correctly.
postman ui

By following these steps, we should be able to test and verify that the Spring Cloud Gateway can be correctly configured and handling the requests and CORS as intended of the Spring Boot application.