package corejava;

public class OverLoading {

	void sum() {
		System.out.println("blank sum");
	}

	void sum(int a, int b) {
		System.out.println(" sum " + (a + b));
	}

	void sum(int a, int b, int c) {
		System.out.println(" sum " + (a + b + c));
	}

	void sum(float f, float g) {
		System.out.println(" sum " + (f + g));
	}

	public static void main(String[] args) {
		OverLoading loading = new OverLoading();
		loading.sum();
		loading.sum(11, 22);
		loading.sum(11, 22.7f);
		loading.sum(11, 2266);
	}

}
