public  final class Formula {
	final 
	float speed(float distance, float time) {
		return distance / time;
	}

	void info() {
		System.out.println("formula class");
	}
}

class MyFormula extends Formula {
	@Override
	float speed(float distance, float time) {
		return distance / 2 * time;
	}

}