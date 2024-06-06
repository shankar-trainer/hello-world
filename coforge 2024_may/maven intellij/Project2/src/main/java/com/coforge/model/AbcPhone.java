package com.coforge.model;

public class AbcPhone  implements  Phone,SmartPhone,MyPhone {

    private int regNo;
    private String model;
    private float cost;

    public AbcPhone(int regNo, String model, float cost) {
        this.regNo = regNo;
        this.model = model;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "AbcPhone{" +
                "regNo=" + regNo +
                ", model='" + model + '\'' +
                ", cost=" + cost +
                ", country=" + country +
                '}';
    }

    public int getRegNo() {
        return regNo;
    }

    public String getModel() {
        return model;
    }
    public String getCountry() {
        return country;
    }

    public float getCost() {
        return cost;
    }

    @Override
    public void calendar() {
        System.out.println("abcphone has calendar facility");
    }

    @Override
    public void email() {
        System.out.println("abcphone has email facility");
    }

    @Override
    public void call() {
        System.out.println("abcphone has call facility");
    }

    @Override
    public void message() {
        System.out.println("abcphone has messaging facility");
    }

    @Override
    public void playAudioSongs() {
        System.out.println("abcphone has playAudioSongs facility");
    }

    @Override
    public void playVideo() {
        System.out.println("abcphone has playVideo facility");
    }

    @Override
    public void netSurf() {
        System.out.println("abcphone has netSurf facility");
    }

    @Override
    public void payment() {
        System.out.println("abcphone has payment facility");
    }
}

