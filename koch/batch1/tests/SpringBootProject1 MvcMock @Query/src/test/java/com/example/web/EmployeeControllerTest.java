package com.example.web;

import com.example.model.Employee;
import com.example.service.EmployeeService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Arrays;
import java.util.List;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest
public class EmployeeControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private EmployeeService service;

    @Test
    public void getAllEmployeeListTest() throws Exception {
        Employee employee[] = new Employee[]{
                Employee.builder().id(10001).name("sumit kumar").salary(12000).build(),
                Employee.builder().id(10002).name("pawan kumar").salary(18000).build(),
                Employee.builder().id(10003).name("nikhil kumar").salary(20000).build(),
        };
        service.addEmployee(employee[0]);
        service.addEmployee(employee[1]);
        service.addEmployee(employee[2]);

        List<Employee> list = Arrays.asList(employee);

        Mockito.when(service.getAllEmployeeList()).thenReturn(list);

        mockMvc.perform(MockMvcRequestBuilders.get("/emp/employee")).
                andExpect(status().isFound()).
                andExpect(content().contentType(MediaType.APPLICATION_JSON)).
                andExpect(jsonPath("$", Matchers.hasSize(3))).
                andExpect(jsonPath("$[0].id").value(10001)).
                andExpect(jsonPath("$[0].name").value("sumit kumar")).
                andExpect(jsonPath("$[0].salary").value(12000));
    }

    static ObjectMapper mapper = new ObjectMapper();

    @Test
    public void addEmployeeTest() throws Exception {
        Employee emp1 = Employee.builder().id(10001).name("sumit kumar").salary(12000).build();
        //Mockito.when(service.addEmployee(emp1)).thenReturn(emp1);
        Mockito.when(service.addEmployee(ArgumentMatchers.any())).thenReturn(emp1);
        String json = mapper.writeValueAsString(emp1);

        mockMvc.perform(MockMvcRequestBuilders.post("/emp/employee").
                        contentType(MediaType.APPLICATION_JSON).
                        content(json).accept(MediaType.APPLICATION_JSON)).
                andExpect(status().isCreated()).
                andExpect(jsonPath("$.id").value(10001)).
                andExpect(jsonPath("$.name").value("sumit kumar")).
                andExpect(jsonPath("$.salary").value(12000));
    }
}
