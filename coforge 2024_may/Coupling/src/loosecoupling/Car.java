package loosecoupling; 

public class Car implements Vehicle {
	@Override
	public void start() {
		System.out.println("Tarvel By Car ");
	}
}
