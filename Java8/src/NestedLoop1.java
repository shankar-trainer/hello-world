
public class NestedLoop1 {

	public static void main(String[] args) {
		for (int i = 1; i <=5; i++) { 
			for (int j = 1; j <=i; j++)  
				System.out.print("*  ");
			
			System.out.println();
		}
		System.out.println("table 1 to 5\n");
		
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=10; j++) 
				System.out.print(i*j+"\t");
			System.out.println();
     		}
		}
}
