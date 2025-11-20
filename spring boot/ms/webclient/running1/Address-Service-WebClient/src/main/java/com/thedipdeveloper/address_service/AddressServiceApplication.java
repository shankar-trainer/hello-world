package com.thedipdeveloper.address_service;

import com.thedipdeveloper.address_service.entity.Address;
import com.thedipdeveloper.address_service.repository.AddressRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class AddressServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AddressServiceApplication.class, args);
    }

    @Autowired
    AddressRepository addressRepo;

    @PostConstruct
    public void add() {
        Address address[] = new Address[]{
                new Address(1, "lucknow", "UP", 1),
                new Address(2, "shimal", "HP", 2),
                new Address(3, "bhopal", "MP", 3),
                new Address(4, "amarabati", "AP", 4),
        };
        addressRepo.saveAll(Arrays.asList(address));

        addressRepo.findAll().forEach(addr1 -> System.out.println(addr1));
    }
}


//http://localhost:8080/employee-service/h2-console/

//http://localhost:8081/address-service/address/1
// output {"id":1,"city":"lucknow","state":"UP"}
//http://localhost:8080/employee-service/employees/1
//output {"id":1,"name":"ram kumar","email":"ram@gmail.com","age":"20","addressResponse":{"id":1,"city":"lucknow","state":"UP"}}

//http://localhost:8081/address-service/h2-console

/*
mysql> select * from address;
+--------+----+-----------+-------+
| emp_id | id | city      | state |
+--------+----+-----------+-------+
|      1 |  1 | lucknow   | UP    |
|      2 |  2 | shimal    | HP    |
|      3 |  3 | bhopal    | MP    |
|      4 |  4 | amarabati | AP    |
+--------+----+-----------+-------+
4 rows in set (0.00 sec)

mysql> drop table employee;
Query OK, 0 rows affected (0.06 sec)

mysql> select * from employee;
+-----+------+-----------------+-------------+
| id  | age  | email           | name        |
+-----+------+-----------------+-------------+
| 252 | 20   | ram@gmail.com   | ram kumar   |
| 253 | 23   | shyam@gmail.com | shyam kumar |
| 254 | 40   | mohan@gmail.com | mohan kumar |
| 255 | 26   | kamal@gmail.com | kamal kumar |
+-----+------+-----------------+-------------+


 */