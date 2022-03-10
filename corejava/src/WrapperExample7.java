
public class WrapperExample7 {

	public static void main(String[] args) {
		for(int x=97;x<=121;x++) {
			if(x%5==0)
				System.out.println();
			System.out.print((char)x+"\t");
		}
		
		System.out.println();
		
		System.out.println("-------------");
		int x=1;
		for(char c='a';c<='z';c++) {
			if(x%5==0)
				System.out.println();
		 System.out.print(c+"\t");	
		 x++;
		}
		System.out.println();
		//System.out.println((char)48);
		for(x=48;x<=57;x++)
			System.out.println((char)x); 
	}
}
