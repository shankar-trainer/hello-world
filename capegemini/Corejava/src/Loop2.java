
public class Loop2 {

	public static void main(String[] args) {
   
		 for (int i = 1; i <=10; i++) {
			System.out.println(i);
			}
		 
		 System.out.println("================");
		 int c=1;
		 for(;c<=10;){
			 System.out.println(c);
			 c+=3;
		 }
		
		 System.out.println("================");
		 
		 for (int i = 1, j=5; i <=10; i++, j+=5) {
			System.out.println(i+ "   "+j);
		}
		 
		 System.out.println("================");
		 
		 for(;;)
			 System.out.println("hello ");
		 
	/*	 for(;;);
			 System.out.println("hello ");
		 */
		
	}
}
