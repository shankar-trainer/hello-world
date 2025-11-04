package com.cts.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int carRegNo;
    private String carModel;
    private int carCost;
    private LocalDate carMfd;

    // multiple car has one customer
    @JsonIgnoreProperties("carSet")
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getCarRegNo() {
        return carRegNo;
    }

    public void setCarRegNo(int carRegNo) {
        this.carRegNo = carRegNo;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getCarCost() {
        return carCost;
    }

    public void setCarCost(int carCost) {
        this.carCost = carCost;
    }

    public LocalDate getCarMfd() {
        return carMfd;
    }

    public void setCarMfd(LocalDate carMfd) {
        this.carMfd = carMfd;
    }


}
