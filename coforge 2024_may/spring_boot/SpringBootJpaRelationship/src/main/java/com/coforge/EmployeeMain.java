package com.coforge;

import com.coforge.dao.AddressRepository;
import com.coforge.dao.EmployeeRepository;
import com.coforge.model.Address;
import com.coforge.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeMain  implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeMain.class,args);
    }

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    AddressRepository addressRepository;

    @Override
    public void run(String... args) throws Exception {

        Address address= new Address();
        address.setSector("sector1");
        address.setCity("delhi");
        address.setPin(6776767);

      Employee employee=new Employee();
        employee.setName("ram kumar");
        employee.setSalary(25000);
        employee.setAddress(address);

//        Address address=Address.builder().sector("sector2").city("new delhi").pin(5665656).build();
//
//        Employee employee=Employee.builder().name("ram kumar").salary(20000).address(address).build();

        addressRepository.save(address);
        employeeRepository.save(employee);

    }
}
