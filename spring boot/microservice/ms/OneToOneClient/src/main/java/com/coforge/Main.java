package com.coforge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }
}
/*
http://localhost:9090/person
POST
{
 "name":"suman kumar",
  "phone":{
  "model":"nokia"
   },
   "carSet":[
       {"carModel":"tata sumo"},
       {"carModel":"hundai i10"},
       {"carModel":"bmw"},
       {"carModel":"scorpio"}
   ]

}
http://localhost:8080/person
 */
