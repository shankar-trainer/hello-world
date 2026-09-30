package com.example.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest
public class AccountControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void accountControllerTest() throws Exception {
		mockMvc.perform(get("/"))
		.andExpect(status().isOk())
		
		.andExpect(view().name("accountForm"));
	}
	
	
}
