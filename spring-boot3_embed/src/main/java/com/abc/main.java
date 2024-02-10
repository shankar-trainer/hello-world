package com.abc;

import com.abc.dao.UserRepository;
import com.abc.model.Address;
import com.abc.model.Car;
import com.abc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class main  implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(main.class,args);
    }

    @Autowired
    UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user=new User();
        user.setName("ram kumar");

        Address address=new Address();
        address.setAddress_id(1);
        address.setCity("delhi");
        user.setAddress(address);

        User user1=new User();
        user1.setName("shyam kumar");
        Address address1=new Address();
        address1.setAddress_id(2);
        address1.setCity("chennai");
        user1.setAddress(address1);


        Car car[]=new Car[3];

        car[0]=new Car();
        car[0].setCar_id(10001);
        car[0].setModel("toyota");

        car[1]=new Car();
        car[1].setCar_id(10002);
        car[1].setModel("maruti");

        car[2]=new Car();
        car[2].setCar_id(10003);
        car[2].setModel("jaguar");

        Car car1[]=new Car[3];

        car1[0]=new Car();
        car1[0].setCar_id(20001);
        car1[0].setModel("celario");

        car1[1]=new Car();
        car1[1].setCar_id(20002);
        car1[1].setModel("india");

        car1[2]=new Car();
        car1[2].setCar_id(20003);
        car1[2].setModel("maruti swift");

        //Set<Car> set1=    Stream.of(car).collect(Collectors.toSet());
        //Set<Car> set2=    Stream.of(car1).collect(Collectors.toSet());

        Set<Car> set1=new HashSet<>();
        set1.add(car[0]);
        set1.add(car[1]);
        set1.add(car[2]);

        Set<Car> set2=new HashSet<>();
        set2.add(car1[0]);
        set2.add(car1[1]);
        set2.add(car1[2]);

        user.setCarSet(set1);
        user1.setCarSet(set2);

        userRepository.save(user);
        userRepository.save(user1);

        userRepository.findAll().forEach(System.out::println);
    }
}
