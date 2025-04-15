package com.example.demo;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@ExtendWith(SpringExtension.class)
//@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)

@SpringBootTest(classes = { com.cts.ProductMain.class }, webEnvironment = WebEnvironment.DEFINED_PORT)
@AutoConfigureMockMvc
public class Demo1ApplicationTests {
	@Autowired
	private MockMvc mockMvc;
/*
	@Test
	public void getsAllPerson() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/prd/getAll").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andReturn();
	}

	@Test
	public void searchProductTest() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/prd/search/1001").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andReturn();
	}

	@Test
	public void ProductNotFound() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/prd/search/1").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isNotFound()).andReturn();
	}

	@Test
	public void addProductTest() throws Exception {
		String prd = "{\"name\":\"sweets\",\"id\":1090,\"cost\":200.0}";
		mockMvc.perform(MockMvcRequestBuilders.post("/prd/addProduct").contentType(MediaType.APPLICATION_JSON)
				.content(prd).accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk()).andReturn();
	}
*/
}
