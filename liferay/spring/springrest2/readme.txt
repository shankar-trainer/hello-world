To build a REST API using traditional Spring MVC without Spring Boot, you must manually configure the dependencies, the servlet initializer, and the Spring context configuration instead of relying on auto-configuration.Below is a complete, modern Java-based configuration example (no web.xml needed) that compiles into a traditional WAR file for deployment on an external server like Apache Tomcat.1. Project Dependencies (pom.xml)You must explicitly include the Spring Web MVC and Jackson libraries (for JSON processing).xml<dependencies>
    <!-- Spring Web MVC Framework -->
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-webmvc</artifactId>
        <version>6.1.5</version> <!-- Use the version appropriate for your setup -->
    </dependency>

    <!-- Jackson for automatic JSON serialization/deserialization -->
    <dependency>
        <groupId>com.fasterxml.jackson.core</groupId>
        <artifactId>jackson-databind</artifactId>
        <version>2.17.0</version>
    </dependency>

    <!-- Java Servlet API (provided by the Tomcat container) -->
    <dependency>
        <groupId>jakarta.servlet</groupId>
        <artifactId>jakarta.servlet-api</artifactId>
        <version>6.0.0</version>
        <scope>provided</scope>
    </dependency>
</dependencies>
Use code with caution.2. Web Application InitializerThis class replaces the traditional web.xml file. It boots up the Spring application context and maps the DispatcherServlet to intercept incoming HTTP requests.java// Replaces web.xml to bootstrap Spring
public class MyWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override protected Class<?>[] getRootConfigClasses() { return null; }
    @Override protected Class<?>[] getServletConfigClasses() { return new Class<?>[] { WebConfig.class }; }
    @Override protected String[] getServletMappings() { return new String[] { "/" }; }
}
Use code with caution.3. Spring Web ConfigurationThis class enables Spring MVC, scans for components, and sets up JSON support.java@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.example")
public class WebConfig implements WebMvcConfigurer {}
Use code with caution.4. Controller and ModelCreate a simple POJO and a @RestController to handle requests and return JSON.java@RestController
public class HelloController {
    @GetMapping("/api/hello")
    public Message sayHello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Message("Hello, " + name + "!");
    }
}
// Note: Requires a simple 'Message' POJO class with getters/setters.
Use code with caution.How to Run This ApplicationPackage the application as a WAR file (mvn clean package).Deploy the generated .war file to an external Apache Tomcat instance.Access: http://localhost:8080/YOUR_APP_NAME/api/hello?name=SpringFor further guidance, feel free to ask about:Using specific servlet containers (Jetty, WildFly).Integrating database access (Hibernate/JDBC) without Boot.Using legacy XML-based configurations (web.xml).