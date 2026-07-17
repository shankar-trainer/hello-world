ApplicationContextInitializer example with database

Got it — you want an ApplicationContextInitializer example that sets up a database (e.g., for integration tests) in Spring.
A common real-world use case is to start a Testcontainers database before the Spring context loads, and inject its connection properties into the environment.

Here’s a complete, runnable example using Spring Boot, JUnit 5, and Testcontainers.

1️⃣ ApplicationContextInitializer Implementation
Java

Copy code
package com.example.demo;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;
import org.testcontainers.containers.PostgreSQLContainer;

import java.util.HashMap;
import java.util.Map;

/**
 * Initializes Spring context with dynamic DB properties from Testcontainers.
 */
public class TestDatabaseInitializer
        implements ApplicationContextInitializer<ConfigurableApplicationContext> {

    // Static container so it starts only once per test run
    private static final PostgreSQLContainer<?> POSTGRES =
            new PostgreSQLContainer<>("postgres:15.3")
                    .withDatabaseName("testdb")
                    .withUsername("testuser")
                    .withPassword("testpass");

    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        // Start container before Spring context loads
        POSTGRES.start();

        ConfigurableEnvironment env = applicationContext.getEnvironment();
        Map<String, Object> props = new HashMap<>();
        props.put("spring.datasource.url", POSTGRES.getJdbcUrl());
        props.put("spring.datasource.username", POSTGRES.getUsername());
        props.put("spring.datasource.password", POSTGRES.getPassword());
        props.put("spring.datasource.driver-class-name", POSTGRES.getDriverClassName());

        // Add properties to Spring Environment
        env.getPropertySources().addFirst(new MapPropertySource("testDbProps", props));
    }
}
2️⃣ Integration Test Using the Initializer
Java

Copy code
package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ContextConfiguration(initializers = TestDatabaseInitializer.class)
class DatabaseIntegrationTest {

    @Test
    void contextLoads() {
        // If the context loads, DB connection properties were set correctly
        assertThat(true).isTrue();
    }
}
3️⃣ application.properties (minimal)
Properties

Copy code
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
4️⃣ Maven Dependencies
Xml

Copy code
<dependencies>
    <!-- Spring Boot Starter Data JPA -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>

    <!-- PostgreSQL Driver -->
    <dependency>
        <groupId>org.postgresql</groupId>
        <artifactId>postgresql</artifactId>
        <scope>runtime</scope>
    </dependency>

    <!-- Testcontainers for PostgreSQL -->
    <dependency>
        <groupId>org.testcontainers</groupId>
        <artifactId>postgresql</artifactId>
        <scope>test</scope>
    </dependency>

    <!-- JUnit 5 -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
    </dependency>
</dependencies>
How It Works
TestDatabaseInitializer starts a PostgreSQL Testcontainer before the Spring context is created.
It injects the container’s JDBC URL, username, and password into the Spring Environment.
Spring Boot auto-configures the DataSource using these dynamic values.
Tests run against an isolated, disposable database.
✅ This approach is clean because:

No hardcoded DB URLs in application.properties.
Works for parallel test runs.
Database is ephemeral and reproducible.
If you want, I can also give you a production + test hybrid version where the initializer switches between a real DB and Testcontainers based on a profile.
Do you want me to prepare that?


