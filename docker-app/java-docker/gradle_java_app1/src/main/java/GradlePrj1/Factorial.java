package GradlePrj1;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Factorial{
  public static void  main(String args[])  throws IOException
  {
    int p=6,fact=1;
   Scanner sc= new Scanner(System.in);

  /*
   java.util.NoSuchElementException is thrown when there is no next element. To avoid this you should check by using hasNext().
   if(sc.hasNext())
    String s1=sc.next();
if(sc.hasNextInt() )
    int x=sc.nextInt();
   
   */

	   System.out.println(" enter a no  ");
  
	   p=sc.nextInt();
/*    
      if(sc.hasNextInt()) 
       { 
		   System.out.println(" enter a no  ");
  
      p=sc.nextInt();
   }
   */
   
    //Scanner sc= new Scanner(System.in);
 //  BufferedReader reader = new BufferedReader(
   //         new InputStreamReader(System.in));
   
   //System.out.println(" enter a no  ");
    //sc.nextLine();
    //p=sc.nextInt();
    //reader.readLine();
    //String s=reader.readLine();
    //p=Integer.parseInt(s);
   for(int x=1;x<=p;x++){
         fact=fact*x;
     }
   System.out.println(" factorial is "+fact);
 }
}
