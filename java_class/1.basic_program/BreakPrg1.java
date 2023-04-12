class BreakPrg1{
	
	public static void main(String args[]){
		
	int x=new java.util.Scanner(System.in).nextInt();
	
    int count=1;

     while(count<=15)
      {
	   System.out.println(count+" * "+x+" = "+(count*x));
 	   if(count==10)
		   break;
 
       count=count+1;
      }	   
		
	}
}