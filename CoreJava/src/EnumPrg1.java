
public class EnumPrg1 {
	
	enum Season {
		Summer(10), Fall(11), Winter(12), Spring(13);
		int x;
		
		Season(int x) {
			this.x=x;
			System.out.println("enum constructor called ");
		}
	}

	public static void main(String[] args) {
		System.out.println(Season.Spring);
		System.out.println(Season.Winter);
		System.out.println();
		
		Season[] values = Season.values();
		for (Season season : values) {
			System.out.println(season+"  "+season.x);
		}
	}
}
