public class Vehicle {
}

class MyCar{}
class Car extends Vehicle{

    public static void main(String[] args) {
        Car car=new Car();
        System.out.println(car instanceof  Car);
        System.out.println(car instanceof  Vehicle);
        System.out.println(car instanceof  Object);

        if( car instanceof  Car)
            System.out.println("car is instance of Car ");
       // System.out.println(car instanceof  MyCar);
    }

}
