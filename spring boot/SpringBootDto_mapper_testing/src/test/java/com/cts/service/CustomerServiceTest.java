package com.cts.service;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import com.cts.dto.CustomerDTO;
import com.cts.exception.CustomerException;
import com.cts.mapper.DTOMapper;
import com.cts.model.Customer;
import com.cts.repository.CustomerRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@ExtendWith(MockitoExtension.class)
public class CustomerServiceTest {

    @Mock
    private CustomerRepository customerRepository;

    @Mock
    private DTOMapper dtoMapper;

    @InjectMocks
    private CustomerService customerService;

    @Test
    void addCustomer() {
        Customer customer = Customer.builder().id(0).name("pawan kumar").salary(56000).build();

        Customer customer1 = Customer.builder().id(0).name("pawan kumar").salary(56000).build();

        CustomerDTO dto1 = CustomerDTO.builder().name("pawan kumar").salary(56000).build();

        CustomerDTO dto2 = CustomerDTO.builder().name("pawan kumar").salary(56000).build();

        Mockito.when(dtoMapper.dtoToEntity(dto1)).thenReturn(customer);

        Mockito.when(customerRepository.save(customer)).thenReturn(customer1);

        CustomerDTO dto=customerService.addCustomer(dto1);
        Assertions.assertEquals(dto2, dto1);
    }

    @Test
    void getAllCustomer() {
        Mockito.when(customerRepository.findAll()).
                thenThrow(new CustomerException("list is empty"));
        Assertions.assertThrows(CustomerException.class, () -> customerService.
                getAllCustomer(), "list is empty");
    }

    @Test
    void getAllCustomer1() {
        Customer c1 = Customer.builder().name("amit kumar").salary(12000).build();
        Customer c2 = Customer.builder().name("suresh kumar").salary(15000).build();

        Mockito.when(customerRepository.findAll()).thenReturn(Arrays.asList(c1, c2));
//        List<Customer> all = customerRepository.findAll();
        List<Customer> all = customerService.getAllCustomer1();

        Assertions.assertEquals(2, all.size());

        Customer customer1 = all.get(0);
        Customer customer2 = all.get(1);

        Assertions.assertEquals("amit kumar", customer1.getName());
        Assertions.assertEquals("suresh kumar", customer2.getName());

        Assertions.assertEquals(12000, customer1.getSalary());
        Assertions.assertEquals(15000, customer2.getSalary());
    }

    @Test
    void searchById() {
        Mockito.when(customerRepository.findById(10001)).thenThrow(new CustomerException("id not found"));
        Assertions.assertThrows(CustomerException.class, () -> customerService.searchById(10001), "id not found");

    }

    @Test
    void searchById1() {
        Customer customer = Customer.builder().id(10001).name("pawan kumar").salary(56000).build();

        Mockito.when(customerRepository.findById(10001)).thenReturn(Optional.ofNullable(customer));
        Assertions.assertEquals(customerService.searchById(10001), customer);

    }

}