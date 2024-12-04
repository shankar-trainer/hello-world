package loosely;

interface Vehicle {
    void start();
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("car starts ");
    }
}

class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("bike  starts ");
    }
}

public class LooselyCoupled {
    private Vehicle vehicle;

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public static void main(String[] args) {
        LooselyCoupled looselyCoupled = new LooselyCoupled();
        Vehicle vehicle = new Car();

        looselyCoupled.setVehicle(vehicle);
        looselyCoupled.getVehicle().start();

        vehicle = new Bike();
        looselyCoupled.setVehicle(vehicle);
        looselyCoupled.getVehicle().start();
    }
}

class LooselyCoupled1 {
    private Vehicle vehicle;

    public LooselyCoupled1(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public static void main(String[] args) {
       /* Vehicle vehicle1 = new Bike();
        LooselyCoupled1 looselyCoupled1 = new LooselyCoupled1(vehicle1);*/

        LooselyCoupled1 looselyCoupled1 = new LooselyCoupled1(new Bike());
        looselyCoupled1.getVehicle().start();

      /*  vehicle1 = new Car();
        looselyCoupled1 = new LooselyCoupled1(vehicle1);
*/
        looselyCoupled1 = new LooselyCoupled1(new Car());
        looselyCoupled1.getVehicle().start();

    }
}

