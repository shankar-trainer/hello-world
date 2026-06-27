package com.cts.config;


import com.cts.model.Book;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.time.LocalDate;

@Configuration
public class AppConfig {

    @Bean
    @Scope(value = "prototype")
    public Book getBook(){
       return  new Book(767676,"java for beginner","a kumar", LocalDate.of(2022,11,23));
    }

}
