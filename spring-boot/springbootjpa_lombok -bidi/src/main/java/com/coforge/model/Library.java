package com.coforge.model;


import jakarta.annotation.PostConstruct;
import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

//@Getter
//@Setter
//@ToString
//@EqualsAndHashCode
@Data
@PropertySource("library.properties")
@Component
public class Library {
    @Value("${library.id}")
    private int id;

    @Value("${library.name}")
    private String name;
    private LocalDate startDate;

    @PostConstruct
    public void init(){
        this.startDate=LocalDate.of(2022,11,22);
    }

}
