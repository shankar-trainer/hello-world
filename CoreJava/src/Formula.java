
public final class Formula {

 final 	float speed(float d1, float d2) {
		return (d1 + d2) / 2;
	}
    
	void info() {
		System.out.println("Formula information");
	}
}
/*
class MyFormula extends Formula {
	@Override
	float speed(float d1, float d2) {
			return (d1 + d2) / 4;
	}
	
	@Override
	void info() {
		System.out.println("MyFormula information");
	}
}
*/