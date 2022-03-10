
public class WrapperExample6 {

	public static void main(String[] args) {
		
		int x1=65;
		System.out.println(x1);
		System.out.println((char)x1);
		// ASCII  0 - 255 
		
		for(int x=65;x<=90;x++) {
			if(x%5==0)
				System.out.println();
			System.out.print((char)x+"\t");
		}
		
		System.out.println();
		
		System.out.println("-------------");
		int x=1;
		for(char c='A';c<='Z';c++) {
			if(x%5==0)
				System.out.println();
		 System.out.print(c+"\t");	
		 x++;
		}
	}
}
