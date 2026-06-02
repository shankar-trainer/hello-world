

spring boot mvc disable jsr 303 in case of search by id , show all with multiple buttons in index.jsp full example

To selectively disable JSR-303 validation based on which button a user clicks in a Spring MVC application, the standard approach is to use Spring's Validation Groups.

By default, @Valid or @Validated triggers all constraints. By creating a specific validation group (an interface) and applying it only to the form submission that requires it (like creating/updating), you can effectively skip validation when the user clicks buttons like "Search by ID" or "Show All".

Here is a complete, working example using Spring Boot, a JSP view, and Validation Groups.

1. Define the Validation Group
Create a marker interface. Constraints assigned to this group will only run when explicitly requested.

Java
package com.example.demo.validation;

public interface ExtendedValidationGroup {
    // Marker interface for JSR-303 groups
}
2. Create the Form Model (DTO)
Apply the group to the fields that require validation. Notice that id does not have the group, so it won't be validated under ExtendedValidationGroup.

Java
package com.example.demo.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import com.example.demo.validation.ExtendedValidationGroup;

public class UserForm {

    private String id; // No validation constraints for search

    @NotBlank(message = "Name is required for saving!", groups = ExtendedValidationGroup.class)
    @Size(min = 2, message = "Name must be at least 2 characters!", groups = ExtendedValidationGroup.class)
    private String name;

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
3. Build the Controller
We use @Validated(ExtendedValidationGroup.class) only on the save method. The search and fetch-all methods accept the form without triggering that validation group.

Java
package com.example.demo.controller;

import com.example.demo.model.UserForm;
import com.example.demo.validation.ExtendedValidationGroup;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("userForm", new UserForm());
        return "index";
    }

    // 1. SAVE: JSR-303 Validation is ENABLED here using the group
    @PostMapping(value = "/user", params = "action=save")
    public String saveUser(@Validated(ExtendedValidationGroup.class) @ModelAttribute("userForm") UserForm form, 
                           BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("message", "Validation failed!");
            return "index";
        }
        model.addAttribute("message", "User " + form.getName() + " saved successfully!");
        return "index";
    }

    // 2. SEARCH BY ID: Validation is DISABLED (Ignored)
    @PostMapping(value = "/user", params = "action=search")
    public String searchUser(@ModelAttribute("userForm") UserForm form, Model model) {
        // No @Validated annotation means JSR-303 is bypassed
        model.addAttribute("message", "Searching for ID: " + form.getId());
        return "index";
    }

    // 3. SHOW ALL: Validation is DISABLED (Ignored)
    @PostMapping(value = "/user", params = "action=showAll")
    public String showAllUsers(Model model) {
        model.addAttribute("message", "Displaying all users...");
        return "index";
    }
}
Note: The params = "action=..." attribute maps specific buttons to specific controller methods based on the name="action" and value="..." attributes of the HTML buttons.

4. Create the index.jsp
The form uses standard Spring MVC form tags. Multiple submit buttons share the same name (action) but have different values to route to the correct controller method.

HTML
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Spring Boot Multi-Button Form</title>
    <style>
        .error { color: red; font-weight: bold; }
        .success { color: green; font-weight: bold; }
        .form-group { margin-bottom: 15px; }
    </style>
</head>
<body>

    <h2>User Management</h2>

    <c:if test="${not empty message}">
        <p class="success">${message}</p>
    </c:if>

    <form:form modelAttribute="userForm" action="${pageContext.request.contextPath}/user" method="post">
        
        <div class="form-group">
            <label>User ID (For Search Only):</label>
            <form:input path="id" />
        </div>

        <div class="form-group">
            <label>User Name (Required for Save):</label>
            <form:input path="name" />
            <form:errors path="name" cssClass="error" /> 
        </div>

        <div>
            <button type="submit" name="action" value="save">Save User</button>
            
            <button type="submit" name="action" value="search">Search by ID</button>
            
            <button type="submit" name="action" value="showAll">Show All</button>
        </div>

    </form:form>

</body>
</html>
5. Essential application.properties Config
To ensure Spring Boot correctly resolves and processes your JSPs from the standard webapp directory, add these properties:

Properties
spring.mvc.view.prefix=/WEB-INF/jsp/
spring.mvc.view.suffix=.jsp
Make sure your index.jsp file is placed inside src/main/webapp/WEB-INF/jsp/index.jsp.