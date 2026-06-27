package com.coforge.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@SpringBootTest
public class EmployeeTest {

    Employee employee, employee1;

    @BeforeEach
    public void init(){
        employee=new Employee();
        employee1=new Employee();

        employee.setId(10001);
        employee.setName("amit kumar");
        employee.setDob(LocalDate.of(2020, 11,29));

        employee1.setId(10001);
        employee1.setName("amit kumar");
        employee1.setDob(LocalDate.of(2020, 11,29));

        Address address=new Address();
        address.setAddrNo(1);
        address.setState("delhi");
        address.setCity("new delhi");

        Address address1=new Address();
        address.setAddrNo(2);
        address.setState("orrisa");
        address.setCity("jagganath puri");

        Car car=new Car();
        car.setCarRegNo(767676);
        car.setType("maruti");
        car.setCost(560000.00f);

        employee.setCar(car);
        List<Address> list = Arrays.asList(new Address[]{address, address1});

        Set<Address> set1 = list.stream().collect(Collectors.toSet());

        employee.setAddressSet(set1);

        employee1.setCar(car);
        employee1.setAddressSet(set1);
    }

    @Test
    public void test1(){
        Assertions.assertEquals(employee1, employee);
        Assertions.assertSame(employee1, employee);

        Assertions.assertNotNull(employee);
        Assertions.assertNotNull(employee1);
    }

}
