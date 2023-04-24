public class Overload1 {
	static void show(Integer i) {
		System.out.println(i);
	}
	static void show(char i) {
		System.out.println(i);
	}
	static void show(Double i[]) {
		for (Double double1 : i) 
			System.out.println(double1);
	}
	public static void main(String[] args) {
		show(10001);
		show(new Double[] { 1.0, 2.77, 3.0, 4.888, 5.66 });
		show('A');
	}
}
