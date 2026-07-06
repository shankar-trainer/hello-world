package solid.dip.correct;

public class Main {
    public static void main(String[] args) {
     LightBulb lightBulb=new LightBulb();
     Switch aSwitch=new Switch(lightBulb);
     aSwitch.operate1();
     aSwitch.operate2();
    }
}
