package solid.dip.correct;

public class LightBulb  implements Switchable{
    @Override
    public void turnOn() {
        System.out.println("turn on light bulb");
    }

    @Override
    public void turnOff() {
        System.out.println("turn off light bulb");
    }
}
