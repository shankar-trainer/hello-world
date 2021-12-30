//	function with no parameter, no return 

#include<stdio.h>
   void addition()
   {
   int a, b,c;	
   	printf("enter  1st no");
   	scanf("%d",&a);
   	
	printf("enter  2nd no");
   	scanf("%d",&b);
   	c=a+b;
   	printf("\nsum of %d and %d is %d ",a,b,c);
   	}
   

 int main()
 {
   
   printf("using function");
   
   
   addition();
   
   return 1;
   
 }
		 
		
		
