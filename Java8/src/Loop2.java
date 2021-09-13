
public class Loop2 {

	public static void main(String[] args) {
		for (int i = 1; i <=100; i++) {
			System.out.println(i);
			if(i==10)
				break;
		}
		
		for(int k=10;k>=1;k--) {
			System.out.println(k);
		  if(k<4)
			  break;
		}
	}
}
