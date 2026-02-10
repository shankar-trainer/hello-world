package com.cts.service;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import com.cts.dto.CustomerDTO;
import com.cts.mapper.DTOMapper;
import com.cts.model.Customer;
import com.cts.repository.CustomerRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CustomerServiceTest {

    @Mock
    private CustomerRepository customerRepository;

    @Mock
    private DTOMapper dtoMapper;

    @InjectMocks
    private CustomerService customerService;

    @Test
    @DisplayName("Should successfully save customer and return DTO")
    void addCustomer_Success() {
        // 1. Arrange (Mock Data)
        CustomerDTO inputDto = new CustomerDTO();
        Customer customerEntity = new Customer();
        Customer savedEntity = new Customer();
        CustomerDTO outputDto = new CustomerDTO();

        // Define behavior for mocks
        when(dtoMapper.dtoToEntity(any(CustomerDTO.class))).thenReturn(customerEntity);
        when(customerRepository.save(any(Customer.class))).thenReturn(savedEntity);
        when(dtoMapper.entityToCustomerDTO(any(Customer.class))).thenReturn(outputDto);

        // 2. Act
        CustomerDTO result = customerService.addCustomer(inputDto);

        // 3. Assert
        assertNotNull(result);
        verify(dtoMapper, times(1)).dtoToEntity(inputDto);
        verify(customerRepository, times(1)).save(customerEntity);
        verify(dtoMapper, times(1)).entityToCustomerDTO(savedEntity);
    }
}





























































































/*

package com.cts.service;

import com.cts.dto.CustomerDTO;
import com.cts.exception.CustomerException;
import com.cts.mapper.DTOMapper;
import com.cts.model.Customer;
import com.cts.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;

@DataJpaTest
@ComponentScan("com.cts.mapper")
@Slf4j
public class CustomerServiceTest {

    @Mock
    CustomerRepository repository;

    @InjectMocks
    CustomerService customerService;

    //    @Autowired
//    @InjectMocks
//    @Spy
//    @Mock
    @Spy
    DTOMapper dtoMapper=new DTOMapper();

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void addCustomer() {
        Customer customer1 = new Customer();
        customer1.setId(1);
        customer1.setName("hari kumar");
        customer1.setSalary(670000);

        Customer customer2 = new Customer();
        customer2.setId(1);
        customer2.setName("hari kumar");
        customer2.setSalary(670000);

        log.info("test adding customer1 " + customer1);
        Mockito.when(repository.save(customer1)).thenReturn(customer2);

        CustomerDTO dto = dtoMapper.entityToCustomerDTO(customer1);
        log.info("test adding customer1 dto  " + dto);

        CustomerDTO result = customerService.addCustomer(dto);

        Assertions.assertNotNull(result);
        Assertions.assertEquals("hari kumar", result.getName());

        Mockito.verify(repository, Mockito.times(1)).save(customer1);
    }

    @Test
    public void getAllCustomers() {
        Mockito.when(repository.findAll()).thenThrow(new CustomerException("list is empty"));
//        repository.findAll();
//        Assertions.assertThrows(CustomerException.class,()->
//            repository.findAll(),"list is empty"
//        );

        Assertions.assertThrows(CustomerException.class, () ->
                customerService.getAllCustomer(), "list is empty"
        );

    }
}
*/