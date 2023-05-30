package com.example.springBootApp1;

import jakarta.annotation.PostConstruct;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
public class Address {
    private int addrId;
    private  String addrCity;
    private int addrPin;

    @PostConstruct
    public void startup(){
         this.addrId=7766767;
         this.addrCity="new delhi";
         this.addrPin=110012;
    }



}
