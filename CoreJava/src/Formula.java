public final class Formula {

	float interest(float amt, float rate, int time) {
		return amt * rate * time;
	}

	float speed(float d1, float d2) {
		return (d1 + d2) / 2;
	}
}
class MyFormula{
	public static void main(String[] args) {
		Formula formula=new Formula();
		System.out.println("Interest "+formula.interest(7890, 0.5f, 6));
		System.out.println("Speed "+formula.speed(30,50));
	}
	
}

/*
class MyFormula extends Formula {

	@Override
	float interest(float amt, float rate, int time) {
		return amt * rate / 5 * time / 20;
	}

	@Override
	float speed(float d1, float d2) {
		return (d1 + d2) / 2;
	}

	public static void main(String[] args) {
		
	}
}*/

