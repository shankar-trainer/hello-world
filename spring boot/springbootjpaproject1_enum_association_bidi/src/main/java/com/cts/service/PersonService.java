package com.cts.service;

import com.cts.dao.PersonRepository;
import com.cts.dto.PersonDTO;
import com.cts.dto.PersonDTOMapper;
import com.cts.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonDTOMapper mapper;

    @Autowired
    private PersonRepository personRepository;

    public PersonDTO addPerson(Person p){
        personRepository.save(p);
        return mapper.entitytoDTO(p);
    }

    public List<PersonDTO> showAllPerson(){
        List<Person> all = personRepository.findAll();

        
        List<PersonDTO> list=new ArrayList<>();
       // all.forEach(list::add);
        
        for(Person p:all){
            list.add(mapper.entitytoDTO(p));
        }
        return  list;
    }

}
