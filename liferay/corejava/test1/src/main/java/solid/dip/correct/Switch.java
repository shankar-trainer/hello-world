package solid.dip.correct;

public class Switch {
 Switchable switchable;

    public Switch(Switchable switchable) {
        this.switchable = switchable;
    }
    void operate1(){
        switchable.turnOn();
    }
    void operate2(){
        switchable.turnOff();
    }
}
