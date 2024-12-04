package com.example.model;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Address {
    private int addrId;
    private String location;
    private String city;

    public int getAddrId() {
        return addrId;
    }

    public void setAddrId(int addrId) {
        this.addrId = addrId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @PostConstruct
    public void init() {
        this.addrId = 989898;
        this.city = "aagra";
        this.location = "aagra cannt";
    }

    @Override
    public String toString() {
        return "Address{" +
                "addrId=" + addrId +
                ", location='" + location + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
