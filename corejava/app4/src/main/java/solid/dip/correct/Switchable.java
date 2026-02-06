package solid.dip.correct;

public interface Switchable {
    void turnOn();
    void turnOff();
}

class Switch{
    Switchable switchable;

    public Switch(Switchable switchable) {
        this.switchable = switchable;
    }
    public void operate1(){
        switchable.turnOn();
    }
    public void operate2(){
        switchable.turnOff();
    }
}

class LightBulb implements  Switchable{
    @Override
    public void turnOn() {
        System.out.println("LightBulb turnOn");
    }

    @Override
    public void turnOff() {
        System.out.println("LightBulb turnOff");
    }
}
class NightBulb implements  Switchable{
    @Override
    public void turnOn() {
        System.out.println("NightBulb turnOn");
    }

    @Override
    public void turnOff() {
        System.out.println("NightBulb turnOff");
    }
}
class Main{
    public static void main(String[] args) {
        LightBulb lightBulb=new LightBulb();
        NightBulb nightBulb=new NightBulb();

        Switch aSwitch1=new Switch(lightBulb);
        aSwitch1.operate1();

        aSwitch1=new Switch(nightBulb);
        aSwitch1.operate2();
    }
}