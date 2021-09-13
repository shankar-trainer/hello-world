public class ForLoop {

	public static void main(String[] args) {
		for (int i = 1,j=10; i <=10; i++,j=j+10) {
			System.out.println(i+"   "+j);
		}
		
		int k=1;
		for(;k<=10;)
			System.out.println(k++);
		
		System.out.println("infinite loop");
		 
		//for(;;)  // infinite for loop 
			// System.out.println("hello ");
		 
		 System.out.println("while infinite loop");
		 while(true)   // infinite while loop
			 System.out.println("hello 3");
		 
		 //while(1>0) // infinite while loop
			// System.out.println("hello2");
		 
	}
}
