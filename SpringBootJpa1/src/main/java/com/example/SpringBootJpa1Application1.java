package com.example;

import com.example.model.Address;
import com.example.model.Mobile;
import com.example.model.Person;
import com.example.service.AddressService;
import com.example.service.MobileService;
import com.example.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class SpringBootJpa1Application1 implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJpa1Application1.class, args);
    }

    @Autowired
    PersonService service;

    @Autowired
    AddressService addressService;

    @Autowired
    MobileService mobileService;

    @Override
    public void run(String... args) throws Exception {


        Person person1 = new Person();
        person1.setPersonName("johny walker");
        person1.setPersonSalary(34000);

        Address address1 = new Address();
        address1.setAddressLocation("laxminagar");
        address1.setAddressState("delhi");
        address1.setAddressCountry("india");
        address1.setAddressPin(7767676);

        Mobile mobile1 = new Mobile();
        mobile1.setModel("samsung");
        mobile1.setCost(15000);

        Mobile mobile2 = new Mobile();
        mobile2.setModel("nokia");
        mobile2.setCost(12000);

        Mobile mobile3 = new Mobile();
        mobile3.setModel("realme");
        mobile3.setCost(9000);

        Set<Mobile> set1 = new HashSet<>();
        set1.add(mobile1);
        set1.add(mobile2);
        set1.add(mobile3);


        person1.setAddress(address1);
        person1.setMobileSet(set1);


        Person person2 = new Person();
        person2.setPersonName("may lucifer");
        person2.setPersonSalary(39000);

        Address address2 = new Address();
        address2.setAddressLocation("uttamnagar");
        address2.setAddressState("delhi");
        address2.setAddressCountry("india");
        address2.setAddressPin(7767670);

        person2.setAddress(address2);

        Mobile mobile4 = new Mobile();
        mobile4.setModel("apple");
        mobile4.setCost(150000);

        Mobile mobile5 = new Mobile();
        mobile5.setModel("motorolla");
        mobile5.setCost(35000);

        Mobile mobile6 = new Mobile();
        mobile6.setModel("carbon");
        mobile6.setCost(6000);

        Set<Mobile> set2 = new HashSet<>();
        set2.add(mobile4);
        set2.add(mobile5);
        set2.add(mobile6);
        person2.setMobileSet(set2);


//        for (Mobile m : set1)
//            mobileService.addMobile(m);
//        addressService.addAddress(address1);
        // cascade operation no need to save child class
        service.addPerson(person1);
//
//        for (Mobile m : set2)
//            mobileService.addMobile(m);
//        addressService.addAddress(address2);
        service.addPerson(person2);
/*
        try {
            Person person = service.searchPerson(15299);
            System.out.println("found " + person);
        }
        catch (PersonException e){
            System.err.println(e.getMessage());
        }

 */
        //service.getAllPerson().forEach(System.out::println);
        List<Person> allPerson = service.getAllPerson();
        for (Person p : allPerson) {
            System.out.println("\nperson id\tname\tsalary");
            System.out.println(p.getPersonId() + "\t" + p.getPersonName() + "\t" + p.getPersonSalary());
            System.out.println("Address \nid\tLocation\tstate\tpin\tcountry");
            Address address = p.getAddress();

            System.out.println(address.getAddressId() + "\t" + address.getAddressLocation() + "\t" + address.getAddressState() + "\t" + address.getAddressPin() + "\t" + address.getAddressCountry());

            System.out.println("mobile\nid\tmodel\tcost");
            for (Mobile m : p.getMobileSet())
                System.out.println(m.getMobileId() + "\t" + m.getModel() + "\t" + m.getCost());
        }
    }
}
