package solid.dip.incorrect;

public class Switch {
    // has a relationship
    // Employee has address
    private LightBulb lightBulb;

    public Switch(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
    }

    public void operate1(){
        lightBulb.turnOn();
    }
    public void operate2(){
        lightBulb.turnOff();
    }
}

class Main{

    public static void main(String[] args) {
        LightBulb lightBulb=new LightBulb();
        Switch aSwitch=new Switch(lightBulb);
        aSwitch.operate1();
        aSwitch.operate2();
    }
}
