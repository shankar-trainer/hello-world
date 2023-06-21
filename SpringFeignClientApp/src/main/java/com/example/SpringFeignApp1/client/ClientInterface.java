package com.example.SpringFeignApp1.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(url ="http://localhost:8080/",name="helloapp" )
public interface ClientInterface {

    @RequestMapping("/")
    public String getMyData();


}
