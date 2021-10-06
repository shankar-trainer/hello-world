
public class Loop1 {

	public static void main(String[] args) {
	
		for (int i = 65; i <91; i++) {
			System.out.print((char)i+"\t");
			if(i%5==0)
				System.out.println();
		}
		
		for(char c='A';c<='Z';c++){
			System.out.print(c+" ");
		}
		System.out.println();
		
		for(char c='a';c<='z';c++){
			System.out.print(c+" ");
		}		
	}
}
