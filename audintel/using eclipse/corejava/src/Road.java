
public class Road {

	public static void main(String[] args) {
		Bus1 bus = new Bus1("blue", 4, "Bus");
		Car car = new Car("gray", 4, "Car");
		Truck truck = new Truck("yellow", 4, "Truck");

		bus.vehicleInfo();
		bus.carryPassenger();

		truck.vehicleInfo();
		truck.carryGoods();;

		car.vehicleInfo();
		car.shortNMediumDrive();

	}
}
