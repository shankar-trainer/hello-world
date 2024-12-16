package com.ttknpdev.understandhowtoworkwithangular;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UnderstandHowToWorkWithAngularApplication {

    public static void main(String[] args) {
        SpringApplication.run(UnderstandHowToWorkWithAngularApplication.class, args);
    }

}
/*

http://localhost:8080/api/employee/create

{
 "_fullname":"ram kumar",
 "_age":22,
 "_position":"clerk",
 "_salary":20000,
 "_addresses":[
    {
        "_city":"delhi",
        "_country":"india",
        "details":"addr1"
    },
    {
        "_city":"delhi",
        "_country":"india",
        "details":"addr1"
    }
    ]
}
*/