package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootRestDataApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestDataApp1Application.class, args);
	}

}

/*
localhost:9090/student


{
    
    "name":"hari sharma",
    "subject":"computer science",
    "address":{
        "location":"kkanad",
        "city":"kochi",
        "state":"kerala",
        "pin":887776767
    }
}



{
    
    "name":"hari sharma",
    "subject":"computer science",
  
    "address":{
        "location":"kaknad",
        "city":"kochi",
        "state":"kerala",
        "pin":887776767
    },
    
    "courseSet":[
        {
            "name":"java course",
            "fee":20000
        },
         {
            "name":"spring course",
            "fee":25000
        },
         {
            "name":"sql course",
            "fee":5000
        }
    ]
}






















*/