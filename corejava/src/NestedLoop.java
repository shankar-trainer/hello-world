

public class NestedLoop {
	
	 static void floyd_triangle(int n) {
		 System.out.println("\n\n");
		 for (int i = 1; i <=n; i++) {
		    for (int j = 1; j <=i; j++) {
				System.out.print("* ");
			}	
		    System.out.println();
		}
	 }

	public static void main(String[] args) {
      floyd_triangle(3);		
      floyd_triangle(4);		
      floyd_triangle(5);		
	}
}
