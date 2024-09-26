import java.util.Random;


public class RandomTest {
	
	public static void main (String[] args) {
      Random r=new Random();
      System.out.println(r.nextInt());		
      System.out.println("random no between 0 to 10" );
      		
      System.out.println(r.nextInt(11));		
      
      		
      
      int max=300,min=100;
   int   size_of_range=max-min+1;
      //formula  nextInt(max-min+1)+min
      
      System.out.println("random no between "+max +"   and "+min );
      
      System.out.println(r.nextInt(size_of_range)+min);		
      
	}
}

