//package com.coforge.web;
//
//import com.coforge.model.Person;
//import com.coforge.model.Phone;
//import com.coforge.repository.PersonRepository;
//import com.coforge.repository.PhoneRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/")
//public class PhoneController {
//
//    @Autowired
//    PhoneRepository repository;
//
//    @Autowired
//    PersonRepository repository1;
//
//    @GetMapping("/phone")
//    public List<Phone> getPhoneList(){
//        return  repository.findAll();
//    }
//    @PostMapping("/phone")
//    public Phone addPhone(@RequestBody Phone phone){
//        Person person = phone.getPerson();
//        System.out.println(phone.getPerson());
//        phone.setPerson(person);
//        repository1.save(person);
//
//        return  repository.save(phone);
//    }
//
//    @GetMapping("/phone/person/{id}")
//    public Person getPerson(@PathVariable("id")  int id){
//        Optional<Person> byId = repository1.findById(id);
//        Person person = byId.get();
//
//              return  person;
//    }
//
//}
