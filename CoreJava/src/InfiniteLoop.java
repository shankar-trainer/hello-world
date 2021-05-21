
public class InfiniteLoop {

	public static void main(String[] args) {
		
		//while(1>0) {
			System.out.println("hello ");
		//}
		
			for (int i = 1; i<=10; i++) {
				System.out.println(i);
			}
			
			int p=1;
			for(;p<=5;) {
				p++;
				System.out.println(p);
			}
		
	}
}
