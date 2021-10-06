package corejava;

public final class Formula {
	final float PI = 3.14f;
	final String country;

	public Formula() {
		country = "india";
	}

	final float speed(float s1, float s2) {
		return (s1 + s2) / 2;
	}

	float acceleration(float s1, float s2, float t) {
		return (s2 - s1) / t;
	}

	public static void main(String[] args) {

	}

}
