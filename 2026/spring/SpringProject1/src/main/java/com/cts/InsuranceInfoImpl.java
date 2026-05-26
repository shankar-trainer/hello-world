package com.cts;

public class InsuranceInfoImpl implements  InsuranceInfo {

    private String insuranceName;
    private float insurancePremium;
    private String country = "India"; // or inject via setter
    public InsuranceInfoImpl() {}
    @Override
    public void insuranceDetails() {
        System.out.println(" details are ");
        System.out.println("name is  "+insuranceName);
        System.out.println("premium is  "+insurancePremium);
        System.out.println("Country name "+country);
    }

    public void init(){
        System.out.println("init called ");
        this.insuranceName="health insurance";
        this.insurancePremium=12000;
    }

    public void cleanup() {
        System.out.println("cleanup  called ");
    }

    }
