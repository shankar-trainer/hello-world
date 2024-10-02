package tightly;

public class Car {
    void start() {
        System.out.println("car starts ");
    }
}

class Bike {
    void start() {
        System.out.println("bike starts ");
    }

    public static void main(String[] args) {

        Car car = new Car();
        Bike bike = new Bike();
        car.start();
        bike.start();
    }

}