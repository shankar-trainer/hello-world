package com.example.web;

import com.example.model.Book;
import com.example.service.BookService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(BookController.class)
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)

public class BookControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BookService bookService;

    @Test
    void getAllBook() throws Exception {
        Book book[]=new Book[]{
                Book.builder().bname("spring for dummies").cost(1200.0f).build(),
                Book.builder().bname("spring for professional").cost(1100).build(),
                Book.builder().bname("spring for beginners").cost(1240).build(),
                Book.builder().bname("spring in action").cost(1500).build(),
                Book.builder().bname("spring for ejb developer").cost(1700).build(),
        };

        Stream.of(book).forEach(book1->bookService.addBooks(book1));

        List<Book> bookList= Arrays.asList(book);

        when(bookService.getAllBooks()).thenReturn(bookList);
        mockMvc.perform(MockMvcRequestBuilders.get("/book")).
                andExpect(status().isOk()).
                andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON)).
                andExpect(jsonPath("$", Matchers.hasSize(5))).
                andExpect(jsonPath("$[0].bname").value("spring for dummies")).
                andExpect(jsonPath("$[0].cost").value(Float.valueOf(1200.0f)));
    }
    private static ObjectMapper mapper = new ObjectMapper();

    @Test
    public void addBookTest() throws Exception {
        Book book1 = Book.builder().isbn(11).bname("react for beginner").cost(3450).build();
        when(bookService.addBooks(book1)).thenReturn(book1);

        String json = mapper.writeValueAsString(book1);

        mockMvc.perform(post("/book/add").contentType(MediaType.APPLICATION_JSON).
                        content(json).accept(MediaType.APPLICATION_JSON)).
                andExpect(status().isOk()).
                andExpect(jsonPath("$.bname").value("react for beginner")).
                andExpect(jsonPath("$.cost").value((3450.0f)));
    }

    @Test
    public void testCreateOrder() throws Exception {
        Book book1 = Book.builder().isbn(11).bname("react for beginner").cost(3450).build();
        final ObjectMapper objectMapper = new ObjectMapper();

        when(bookService.addBooks(book1)).thenReturn(book1);

        mockMvc.perform(
                        post("/book/add")
                                .content(objectMapper.writeValueAsString(book1))
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.bname", is("react for beginner")))
                .andExpect(jsonPath("$.cost", is(3450.0)));
//                .andExpect(jsonPath("$").isNotEmpty())    );
    }

}
//mvn test -Dtest=com.example.web.BookControllerTest#getAllBook
//mvn test -Dtest=com.example.web.BookControllerTest#addBookTest
