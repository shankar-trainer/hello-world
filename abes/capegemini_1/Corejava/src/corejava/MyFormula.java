package corejava;

public class MyFormula extends Formula {

	@Override
	float acceleration(float s1, float s2, float t) {
		return s1 + s2 / t;
	}

	@Override
	float speed(float s1, float s2) {
		return s1 - s2 / 2;
	}
	
	public static void main(String[] args) {
		
	}

}
