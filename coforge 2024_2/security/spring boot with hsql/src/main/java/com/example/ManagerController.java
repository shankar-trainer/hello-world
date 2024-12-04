package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/manager")
public class ManagerController {

    @Autowired
    ManagerRepo personRepo;

    @GetMapping("/all")
    public List<Manager> personList(){
        return  personRepo.findAll();
    }

    @PostMapping("/new")
    public Manager addManager(@RequestBody Manager manager){
       return personRepo.save(manager);
    }

}