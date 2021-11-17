
public class RacingCar  extends Car{

	public static void main(String[] args) {
		
		RacingCar car=new RacingCar();
		
		car.setRegNo(677676);
		car.setModel("maruti");
		car.setCost(567000);
		
		System.out.println(car.getRegNo());
		System.out.println(car.getModel());
		System.out.println(car.getCost());
		
	}
}
