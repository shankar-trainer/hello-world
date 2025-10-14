package com.cts.dto;

import com.cts.model.Person;
import org.springframework.stereotype.Component;

@Component
public class PersonDTOMapper {

   public Person dtoToEntity(PersonDTO dto){
       Person person=new Person();

       person.setPersonName(dto.getPersonName());
       person.setPersonSalary(dto.getPersonSalary());
       return  person;
    }

   public PersonDTO entitytoDTO(Person p){
       PersonDTO personDTO=new PersonDTO();
       personDTO.setPersonName(p.getPersonName());
       personDTO.setPersonSalary(p.getPersonSalary());
       return  personDTO;
   }
}
