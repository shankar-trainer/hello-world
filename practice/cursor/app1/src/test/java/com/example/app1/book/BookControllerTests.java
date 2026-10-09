package com.example.app1.book;

import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.header;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class BookControllerTests {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private BookRepository bookRepository;

	@BeforeEach
	void cleanDatabase() {
		bookRepository.deleteAll();
	}

	@Test
	void createAndFetchBook() throws Exception {
		String body = """
				{
				  "title": "Clean Code",
				  "author": "Robert C. Martin",
				  "isbn": "9780132350884",
				  "publishedYear": 2008
				}
				""";

		mockMvc.perform(post("/api/books").contentType(MediaType.APPLICATION_JSON).content(body))
				.andExpect(status().isCreated())
				.andExpect(header().exists("Location"))
				.andExpect(jsonPath("$.id").isNumber())
				.andExpect(jsonPath("$.title").value("Clean Code"));

		mockMvc.perform(get("/api/books"))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$", hasSize(1)))
				.andExpect(jsonPath("$[0].author").value("Robert C. Martin"));
	}

	@Test
	void getUnknownBookReturns404() throws Exception {
		mockMvc.perform(get("/api/books/999"))
				.andExpect(status().isNotFound())
				.andExpect(jsonPath("$.message").value("Book not found: 999"));
	}

	@Test
	void createBookRequiresTitle() throws Exception {
		String body = """
				{
				  "title": "",
				  "author": "Someone"
				}
				""";

		mockMvc.perform(post("/api/books").contentType(MediaType.APPLICATION_JSON).content(body))
				.andExpect(status().isBadRequest());
	}

	@Test
	void updateAndDeleteBook() throws Exception {
		Book saved = bookRepository.save(new Book("Old Title", "Author", "111", 2000));

		String update = """
				{
				  "title": "New Title",
				  "author": "Author",
				  "isbn": "111",
				  "publishedYear": 2001
				}
				""";

		mockMvc.perform(put("/api/books/" + saved.getId())
						.contentType(MediaType.APPLICATION_JSON)
						.content(update))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.title").value("New Title"))
				.andExpect(jsonPath("$.publishedYear").value(2001));

		mockMvc.perform(delete("/api/books/" + saved.getId()))
				.andExpect(status().isNoContent());

		mockMvc.perform(get("/api/books/" + saved.getId()))
				.andExpect(status().isNotFound());
	}
}
