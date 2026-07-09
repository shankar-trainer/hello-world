public class Vehicle {
    void start() {
        System.out.println("run the vehicle");
    }
}

class Bus extends Vehicle {
    @Override
    void start() {
        System.out.println("run the bus");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("run the car");
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.start();

        vehicle = new Bus();//
        vehicle.start();

        vehicle = new Car();
        vehicle.start();

    }
}
