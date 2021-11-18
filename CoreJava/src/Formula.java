
public final class Formula {

	float speed(float d1, float d2) {
		return (d1+d2)/2;
	}
	
	float intCalc(float amt, float rate, int time ) {
		return amt*rate*time/100;
	}
}
/*
class MyFormula  extends Formula{
	 @Override
	float speed(float d1, float d2) {
			return (d1+d2)/3;
	}
}

*/