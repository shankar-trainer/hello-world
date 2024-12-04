package com.coforge.model;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Data
@Scope("prototype")
public class Address {

    private int addrId;
    private String  addrLocation;
    private String addrCity;

    @PostConstruct
    public void init() {
        this.addrId=1;
        this.addrLocation="sector 140";
        this.addrCity="greater noida";
    }
}
