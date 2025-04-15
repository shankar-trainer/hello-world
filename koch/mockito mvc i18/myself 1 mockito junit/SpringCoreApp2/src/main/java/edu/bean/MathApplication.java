package edu.bean;

public class MathApplication {

	private CalculatorService calculatorService;

	public void setCalculatorService(CalculatorService calculatorService) {
		this.calculatorService = calculatorService;
	}

	public int divIntMethod(int x, int y) {

		return calculatorService.divisionInt(x, y);
	}

	public double addMethod(double x, double y) {
		return calculatorService.addition(x, y);
	}

	public double subMethod(double x, double y) {
		return calculatorService.subtraction(x, y);
	}

	public double mulMethod(double x, double y) {
		return calculatorService.multiplication(x, y);
	}

	public double divMethod(double x, double y) {
		return calculatorService.division(x, y);
	}

}
