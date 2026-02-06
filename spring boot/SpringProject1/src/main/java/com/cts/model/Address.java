package com.cts.model;

public class Address {
    private int addrId;
    private String  location;
    private String city;

    public Address(int addrId, String location, String city) {
        this.addrId = addrId;
        this.location = location;
        this.city = city;
    }
  public void startup(){
      System.out.println("init-method called");
        this.addrId=10009;
        this.location="shyam bazar";
        this.city="kolkotta";
  }
public void cleanup(){
    System.out.println("destroy-method called");
}
    public int getAddrId() {
        return addrId;
    }

    public String getLocation() {
        return location;
    }

    public String getCity() {
        return city;
    }
}
