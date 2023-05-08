package edu.chitkara;

public class FormulaMain {
	public static void main(String[] args) {

		float d1 = 500;
		float d2 = 300;

		float speed1 = 230;
		float speed2 = 290;
		float time = 100;
		Formula formula = new Formula();

		System.out.println("speed of " + d1 + " and  " + d2 + " distance is " + formula.speed(d1, d2));

		System.out.println("accelaration of  speed " + speed1 + " and  " + speed2 + "  and time  " + time + " is "
				+ formula.accelaration(speed1, speed2, time));

	}
}
