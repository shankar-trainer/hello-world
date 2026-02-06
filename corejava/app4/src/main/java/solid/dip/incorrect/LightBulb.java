package solid.dip.incorrect;

public class LightBulb {
    void turnOn() {
        System.out.println("Light Bulb Turned on");
    }

    void turnOff() {
        System.out.println("Light Bulb Turned off");
    }
}

class NightBulb {
    void turnOn() {
        System.out.println("Night Bulb Turned on");
    }

    void turnOff() {
        System.out.println("Night Bulb Turned off");
    }
}

class Switch {

    LightBulb lightBulb;

    public Switch(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
    }

    public void operate() {
        lightBulb.turnOn();
    }
}
class Main{
    public static void main(String[] args) {
        LightBulb lightBulb=new LightBulb();
        Switch aSwitch=new Switch(lightBulb);
        aSwitch.operate();
    }

}