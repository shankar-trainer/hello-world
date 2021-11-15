import java.util.Iterator;

public class TableOf1to5 {

	
	public static void main(String[] args) {
		for (int i = 1; i <=10; i++) {
			for (int j = 1; j <=5; j++) {
				System.out.print(i*j+"\t");
			}
			System.out.println();
		}
		
		System.out.println("\ntriangle\n");
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print("*  ");
			}
			System.out.println();
		}
	}
	
}
