To test a standard Spring Framework application (without Spring Boot), you use the Spring TestContext Framework. 
Instead of @SpringBootTest, you use @ContextConfiguration to point to your configuration classes or XML files.1. 

Project DependenciesEnsure you have the core Spring Test module in your pom.xml (Maven) or build.
gradle.

xml
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-test</artifactId>
    <version>6.1.0</version> <!-- Use your Spring version -->
    <scope>test</scope>
</dependency>
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter</artifactId>
    <version>5.10.0</version>
    <scope>test</scope>
</dependency>

2. Basic Configuration Example

Unlike Spring Boot, which scans for @SpringBootApplication, you must explicitly tell the test where your beans are defined.Java Configuration:java@Configuration
@ComponentScan(basePackages = "com.example")
public class TestConfig {
    // Define additional beans or mocks here
}


3. The Test Class
Use @ExtendWith(SpringExtension.class) to integrate Spring with JUnit 5. 
The @ContextConfiguration annotation loads your specific settings.javaimport org.junit.jupiter.api.Test;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class) // Integrates Spring TestContext with JUnit 5
@ContextConfiguration(classes = TestConfig.class) // Specifies configuration to load
public class MySpringTest {

    @Autowired
    private MyService myService; // Spring injects this bean from TestConfig

    @Test
    void testServiceLogic() {
        assertNotNull(myService);
        assertEquals("Expected Result", myService.performAction());
    }
}
Use code with caution.Key Differences from Spring Boot TestingNo Auto-configuration:
You must manually define your DataSource, EntityManagerFactory, or InternalResourceViewResolver.
Manual Web Mocks: If testing a web layer, you must use @WebAppConfiguration to tell Spring to create a WebApplicationContext.
No @MockBean: This is a Spring Boot feature. 
In plain Spring, you typically use Mockito directly or define a mock bean in your @Configuration class.