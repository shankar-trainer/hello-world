package com.coforge.dao;

import com.coforge.model.Address;
import com.coforge.model.Car;
import com.coforge.model.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//@DataJpaTest //only with h2
@SpringBootTest // both h2 , mysql
//@ActiveProfiles( {"dev"})
public class EmployeeRepositoryTest {

    Employee employee;

    @BeforeEach
    public void init(){
        employee=new Employee();

        employee.setName("amit kumar");
        employee.setDob(LocalDate.of(2020, 11,29));

        Address address=new Address();
        address.setState("delhi");
        address.setCity("new delhi");

        Address address1=new Address();
        address.setState("orrisa");
        address.setCity("jagganath puri");

        Car car=new Car();
        car.setType("maruti");
        car.setCost(560000.00f);

        List<Address> list = Arrays.asList(new Address[]{address, address1});

        Set<Address> set1 = list.stream().collect(Collectors.toSet());

        employee.setCar(car);
        employee.setAddressSet(set1);
    }

    @Autowired
    private EmployeeRepository repository;

    @Test
    public void testEmployee(){
        repository.save(employee);
        Assertions.assertEquals(repository.findAll().size(), 1);
        var emp1 = repository.findAll().get(0);
    }


}
