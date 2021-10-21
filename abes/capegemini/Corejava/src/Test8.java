import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
 
		Scanner scanner=new Scanner(System.in);

		char product;
		float totalcost=0;
		float cost;
		int qty;
		for (int i = 1; i <=3; i++) {
			cost=0;
			System.out.println("Enter product no or code");
			product=scanner.next().charAt(0);
			
			System.out.println("Enter product quantity");
			qty=scanner.nextInt();
			
			switch (product) {
			case '1':
				cost=(qty*22.50f);
				break;
			case 'A':
				cost=(qty*22.50f);
				break;
			case 'a':
				cost=(qty*22.50f);
				break;	
				
			case '2':
				cost=(qty*44.50f);
				break;
			case 'B':
				cost=(qty*44.50f);
				break;
			case 'b':
				cost=(qty*44.50f);
				break;		
				
			case '3':
				cost=(qty*9.98f);
				break;
			case 'C':
				cost=(qty*9.98f);
				break;
			case 'c':
				cost=(qty*9.98f);
				break;			
				

			default:
				break;
			}
			
			totalcost=totalcost+cost;
			
		}
	    
		System.out.println("total cost is "+totalcost);
		

	}
}
