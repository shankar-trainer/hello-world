package material;

public class Order {

	int lap_quantity;
	int access_quantity;

	public Order(int lap_quantity, int access_quantity) {
		this.lap_quantity = lap_quantity;
		this.access_quantity = access_quantity;
	}

	void checkOrder(int lap_low, int access_low) {
		
		if (lap_quantity <= lap_low && access_quantity <= access_low) {
			System.out.println("invoice will be generated");
		}

		else {

			System.out.println("product not available");
			System.out.println("Request for Material is generated");

		}
	}

}
