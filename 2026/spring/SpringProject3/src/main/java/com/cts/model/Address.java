package com.cts.model;

import jakarta.annotation.PostConstruct;

public class Address {
    private int addrId;
    private String city;
    private String state;

    @Override
    public String toString() {
        return "Address{" +
                "addrId=" + addrId +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    @PostConstruct
    public void init(){
        System.out.println("address init called ");
        this.addrId=1;
        this.city="hyderabad";
        this.state="telengana";
    }

}
