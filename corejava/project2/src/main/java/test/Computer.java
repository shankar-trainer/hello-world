package test;

import java.util.Comparator;

public abstract class Computer {
    abstract void display();

    void hello() {
        System.out.println("hello");
    }

    abstract void show();

}

class Laptop extends Computer {

    @Override
    void display() {
        System.out.println("display method ");
    }

    void show() {
        System.out.println("show ");
    }

    public static void main(String[] args) {
//        Laptop laptop=new Laptop();
        Computer laptop = new Laptop();
        laptop.display();
        laptop.show();
        laptop.hello();
    }
}