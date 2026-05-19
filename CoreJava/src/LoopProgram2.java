
public class LoopProgram2 {

	static void floydTriangle() {
		
		for (int i = 0; i <11; i++) {
			for (int j = 0; j <i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void loop() {
		for (int i = 1, j=2; i <=10; i++, j+=2) {
			System.out.println(i+"   "+j);
		}		
	}
	public static void main(String[] args) {
	
	floydTriangle();
	loop();
	}
}
