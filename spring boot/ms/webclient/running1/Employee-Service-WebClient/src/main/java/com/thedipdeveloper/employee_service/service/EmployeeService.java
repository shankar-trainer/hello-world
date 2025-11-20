package com.thedipdeveloper.employee_service.service;

import com.thedipdeveloper.employee_service.entity.Employee;
import com.thedipdeveloper.employee_service.repository.EmployeeRepository;
import com.thedipdeveloper.employee_service.response.AddressResponse;
import com.thedipdeveloper.employee_service.response.EmployeeResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepo;

    @Autowired
    private ModelMapper mapper;

    @Autowired
    private WebClient webClient;

    public EmployeeResponse getEmployeeById(int id) {

        Optional<Employee> employee = employeeRepo.findById(id);
        EmployeeResponse employeeResponse = mapper.map(employee, EmployeeResponse.class);

        // Using WebClient
        AddressResponse addressResponse =
                webClient
                        .get()
                        .uri("/address/" + id)
                        .retrieve()
                        .bodyToMono(AddressResponse.class)
                        .block();
        employeeResponse.setAddressResponse(addressResponse);

        return employeeResponse;
    }

}
