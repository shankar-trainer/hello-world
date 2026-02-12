package com.example.mapper;

import com.example.dto.PersonDto;
import com.example.model.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    @Mapping(source = "personName", target = "personName")
    @Mapping(source = "personSalary", target = "personSalary")
    PersonDto personToPersonDTo(Person p);

    @Mapping(source = "personName", target = "personName")
    @Mapping(source = "personSalary", target = "personSalary")
    Person personDtoToPerson(PersonDto dto);

}
