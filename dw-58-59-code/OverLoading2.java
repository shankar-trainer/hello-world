
public class OverLoading2 {

	void area(int width, int length) {
		System.out.println("rectagle  area  is " + (width * length));
	}

	void area(int side) {
		System.out.println("square  area  is " + (side * side));
	}

	void area(float side1, float side2, float side3) {
		float s = (side1 + side2 + side3) / 2;
		double ar = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		System.out.println("triangle   area  is " + ar);
	}

	public static void main(String[] args) {
		OverLoading2 loading2=new OverLoading2();
		loading2.area(12);
		loading2.area(12,20);
		loading2.area(12,20,25);
		
	}
}
