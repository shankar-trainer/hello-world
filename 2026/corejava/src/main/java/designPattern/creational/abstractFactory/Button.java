package designPattern.creational.abstractFactory;

public interface Button {
    void paint();
}
interface Checkbox {
    void paint();
}

class LightButton implements  Button{
    @Override
    public void paint() {
        System.out.println("render light button");
    }}
class DarkButton implements  Button{
    @Override
    public void paint() {
        System.out.println("render dark button");
    }}

class DarkCheckBox implements   Checkbox{
    @Override
    public void paint() {
        System.out.println("render dark checkbox");
    }
}
class LightCheckBox implements   Checkbox{
    @Override
    public void paint() {
        System.out.println("render light checkbox");
    }
}