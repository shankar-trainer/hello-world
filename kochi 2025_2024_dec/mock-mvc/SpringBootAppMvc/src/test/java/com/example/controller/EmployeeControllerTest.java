package com.example.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import com.example.model.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(EmployeeController.class)
public class EmployeeControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void testHomePage() throws Exception {
		mockMvc.perform(get("/"))
		.andExpect(status().isOk())
		.andExpect(view().name("index"));
	}
	
	@Test
	public void testemployeeForm() throws Exception {
		mockMvc.perform(get("/empForm"))
				.andExpect(status().isOk())
				.andExpect(view().name("empform"));
	}
	// below not working
	@Test
	public void testemployeeAction() throws Exception {
		mockMvc.perform(get("/empaction"))
				.andExpect(status().isOk())
				.andExpect(view().name("empresult"))
				.andExpect(model().attribute("emp",new Employee()));
	}
}
