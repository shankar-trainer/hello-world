package com.cts.model;

public class Address {
    private int addrId;
    private  String  location;
    private String country;

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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addrId=" + addrId +
                ", location='" + location + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
