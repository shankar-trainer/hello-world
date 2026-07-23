To implement JSR-303 (Bean Validation) in a non-Spring Boot Spring MVC application, you must manually add the Hibernate Validator implementation to your classpath and explicitly enable it inside your Spring XML configuration or Java Config class.Here is a complete, step-by-step example using standard Spring MVC (with Jakarta/Java EE dependencies).1. Add Dependencies (pom.xml)You need the core Spring Web MVC framework, the JSR-303/JSR-380 API, and its reference implementation (Hibernate Validator).xml<dependencies>
    <!-- Spring MVC -->
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-webmvc</artifactId>
        <version>6.1.5</version> <!-- Use 5.x if working with legacy javax namespace -->
    </dependency>

    <!-- JSR-303 / JSR-380 Bean Validation API -->
    <dependency>
        <groupId>jakarta.validation</groupId>
        <artifactId>jakarta.validation-api</artifactId>
        <version>3.0.2</version>
    </dependency>

    <!-- Hibernate Validator (The JSR Implementation) -->
    <dependency>
        <groupId>org.hibernate.validator</groupId>
        <artifactId>hibernate-validator</artifactId>
        <version>8.0.1.Final</version>
    </dependency>
</dependencies>
Use code with caution.2. Enable JSR-303 Validation SupportOption A: Java Configuration (Recommended)Register the LocalValidatorFactoryBean and register it into Spring's MVC Lifecycle.java@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.example")
public class WebMvcConfig implements WebMvcConfigurer {

    @Bean
    public LocalValidatorFactoryBean validator() {
        return new LocalValidatorFactoryBean();
    }

    @Override
    public Validator getValidator() {
        return validator();
    }
}
Use code with caution.Option B: XML Configuration (spring-servlet.xml)If using legacy XML config, adding <mvc:annotation-driven /> automatically detects the Hibernate Validator jar on the classpath and activates bean validation.xml<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:mvc="http://www.springframework.org/schema/mvc"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="
        http://www.springframework.org/schema/beans http://springframework.org
        http://www.springframework.org/schema/mvc http://springframework.org">

    <!-- Automatically registers JSR-303 validation if implementation is present -->
    <mvc:annotation-driven />

    <mvc:resources mapping="/resources/**" location="/resources/" />
    <com.example.config.AppConfig />
</beans>
Use code with caution.3. Create the Model Bean with Constraints (User.java)Annotate model attributes with validation specifications.javapackage com.example.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class User {

    @NotBlank(message = "Name cannot be empty")
    @Size(min = 2, max = 30, message = "Name must be between 2 and 30 characters")
    private String name;

    @NotBlank(message = "Email cannot be empty")
    @Email(message = "Please provide a valid email address")
    private String email;

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
Use code with caution.4. Create the Controller (UserController.java)Apply the @Valid annotation right before your model parameter. Crucially, place the BindingResult parameter immediately following the validated object.javapackage com.example.controller;

import com.example.model.User;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @GetMapping("/register")
    public String showForm(Model model) {
        model.addAttribute("user", new User());
        return "register-form";
    }

    @PostMapping("/register")
    public String processForm(@Valid @ModelAttribute("user") User user, BindingResult bindingResult) {
        // Check if JSR-303 validation rules failed
        if (bindingResult.hasErrors()) {
            return "register-form"; // Return back to form view with error annotations
        }
        return "success";
    }
}
Use code with caution.5. Render Validation Errors in the View (register-form.jsp)Use Spring's specialized form tag library to map specific errors directly beneath your inputs.html<%@ taglib prefix="form" uri="http://springframework.org" %>
<html>
<head>
    <title>User Registration</title>
    <style>.error { color: red; font-style: italic; }</style>
</head>
<body>
    <h2>Register User</h2>

    <form:form action="register" modelAttribute="user" method="post">
        <div>
            <label>Name:</label>
            <form:input path="name" />
            <form:errors path="name" cssClass="error" />
        </div>
        <br/>
        <div>
            <label>Email:</label>
            <form:input path="email" />
            <form:errors path="email" cssClass="error" />
        </div>
        <br/>
        <button type="submit">Submit</button>
    </form:form>
</body>
</html>
Use code with caution.Would you like help resolving custom error message properties files (ValidationMessages.properties), or migrating this architecture to handle a REST API with JSON validation instead of traditional JSP forms?