import java.util.Scanner;

class Factorial{
  public static void  main(String args[]){
    int p=6,fact=1;
   System.out.println(" enter a no  ");
   p=new Scanner(System.in).nextInt();
   
   for(int x=1;x<=p;x++){
         fact=fact*x;
     }
   System.out.println(" factorial is "+fact);
 }
}
