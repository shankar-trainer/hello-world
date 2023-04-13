package com.example.config;

import com.example.model.Share;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by shankar on 4/13/2023.
 */
@Configuration
public class JavaConfig {

    @Bean()
    @Scope(value = "prototype")
    public Share getShare(){
        Set<String > shareAvailableCountries=new HashSet<String>();
        shareAvailableCountries.add("india");
        shareAvailableCountries.add("srilanka");
        shareAvailableCountries.add("nepal");
        shareAvailableCountries.add("srilanka");

      return  new Share(67767,"tcs",45000,shareAvailableCountries);
    }

}
