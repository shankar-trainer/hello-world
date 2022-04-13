import cts.model.Calculator;

public class CalculatorMain {

	public static void main(String[] args) {
		int x=10,y=5;
		Calculator calculator=new Calculator();
		System.out.println("addition of "+x+" and "+y+" is "+calculator.addition(x, y));
		System.out.println("subtraction of "+x+" and "+y+" is "+calculator.subtraction(x, y));
	}
}
