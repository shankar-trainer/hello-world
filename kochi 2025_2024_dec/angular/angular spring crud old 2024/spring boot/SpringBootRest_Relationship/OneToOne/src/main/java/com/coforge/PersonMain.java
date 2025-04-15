package com.coforge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PersonMain {

    public static void main(String[] args) {
        SpringApplication.run(PersonMain.class,args);
    }
}
/*
http://localhost:6060/swagger-ui/index.html

uni direction
POST method
http://localhost:8080/person
 {
"name":"lalan kumar",
"phone":{
    "model":"samsung"
 }
}
http://localhost:8080/phone
bidirectional
{
 "model":"samsung",
"person":{
  "name":"lalan kumar"
}
}

POST method
http://localhost:8080/person
{
 "name":"lalan kumar",
  "phone":{
  "model":"samsung"
   },
   "carSet":[
       {"carModel":"maruti swift"},
       {"carModel":"maruti zen"},
       {"carModel":"bolero"},
       {"carModel":"thar"}
   ]

}

 */