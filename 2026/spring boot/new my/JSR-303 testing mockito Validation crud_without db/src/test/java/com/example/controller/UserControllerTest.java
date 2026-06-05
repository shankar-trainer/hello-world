package com.example.controller;

import com.example.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(UserController.class)
class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        // Optional: If you need to clear or pre-populate state, note that because
        // 'userList' is an in-memory instance variable inside the controller bean,
        // it persists across tests within the same context execution.
    }

    @Test
    void testIndex_ShouldReturnIndexViewWithEmptyFormAndList() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("index"))
                .andExpect(model().attributeExists("users"))
                .andExpect(model().attributeExists("user"))
                .andExpect(model().attribute("user", hasProperty("id", nullValue())));
    }

    @Test
    void testAddUser_WithValidData_ShouldRedirectToIndex() throws Exception {
        mockMvc.perform(post("/add")
                        .param("name", "John Doe")
                        .param("email", "john.doe@example.com"))
                .andExpect(status().is3xxRedirection())
                .andExpect(redirectedUrl("/"));
    }

    @Test
    void testAddUser_WithInvalidData_ShouldReturnIndexViewWithErrors() throws Exception {
        // Assuming your User model has JSR-303 constraints like @NotBlank or @Email,
        // sending empty strings should trigger validation failures.
        mockMvc.perform(post("/add")
                        .param("name", "")
                        .param("email", "invalid-email"))
                .andExpect(status().isOk())
                .andExpect(view().name("index"))
                .andExpect(model().hasErrors())
                .andExpect(model().attributeExists("users"));
    }

    @Test
    void testRemoveUser_ShouldRemoveUserAndRedirect() throws Exception {
        // First, add a user to ensure there is something to remove
        mockMvc.perform(post("/add")
                        .param("name", "Alice")
                        .param("email", "alice@example.com"))
                .andExpect(status().is3xxRedirection());

        // Assuming it's the first user, its ID will be 1L (or 2L depending on execution order)
        // Let's trigger the removal
        mockMvc.perform(get("/remove/{id}", 1L))
                .andExpect(status().is3xxRedirection())
                .andExpect(redirectedUrl("/"));
    }

    @Test
    void testSearchUser_ShouldReturnFilteredResults() throws Exception {
        // 1. Seed data into the in-memory controller list
        mockMvc.perform(post("/add").param("name", "Alex Smith").param("email", "alex@test.com"));
        mockMvc.perform(post("/add").param("name", "Bob Jones").param("email", "bob@test.com"));

        // 2. Perform search query matching 'Alex'
        mockMvc.perform(get("/search").param("keyword", "Alex"))
                .andExpect(status().isOk())
                .andExpect(view().name("index"))
                .andExpect(model().attribute("keyword", "Alex"))
                .andExpect(model().attribute("users", hasSize(greaterThanOrEqualTo(1))))
                .andExpect(model().attribute("users", hasItem(
                        hasProperty("name", containsStringIgnoringCase("Alex"))
                )));
    }
}